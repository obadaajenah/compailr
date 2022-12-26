import constant.MathType;
import expression.VariableEQ;
import expression.math.*;
import expression.Expression;
import expression.Variable;
import expression.VariableDeclaration;
import expression.variableValue.*;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AntlrToExpression extends Dart2ParserBaseVisitor<Expression>{

    private final List<VariableDeclaration> variables = new ArrayList<>();
    private final List<String> semanticErrors ;

    public AntlrToExpression(List<String> semanticErrors){
        this.semanticErrors = semanticErrors;
    }


    /// the whole project
    @Override
    public Expression visitContent(Dart2Parser.ContentContext ctx) {
        return super.visitContent(ctx);
    }


    /// int x = 1;
    /// int x = y + z ;
    @Override
    public Expression visitVarDefinition(Dart2Parser.VarDefinitionContext ctx) {
        Token varToken = ctx.IDENTIFIER().getSymbol();
        Variable var = new Variable(ctx.getChild(1).getText());
        String type = ctx.getChild(0).getText();
        Expression equal = null;
        if(ctx.getChildCount() > 3)
        {
            equal = visit(ctx.getChild(3));
        }
        VariableDeclaration variableDeclaration = new VariableDeclaration(var,type,equal);
        final boolean[] check = {false};
        for (VariableDeclaration temp : variables) {
            if (Objects.equals(temp.id().id(), var.id())) {
                check[0] = true;
                break;
            }
        }
        if(check[0])
        {
            int line = varToken.getLine();
            int column = varToken.getCharPositionInLine() + 1;
            semanticErrors.add("Error : variable " + var.id() + " already declared" + "(" + line + "," + column + ")");
        }
        else {
            variables.add(variableDeclaration);
        }
        if(equal != null)
        {
            checkMismatch(ctx.EQ().getSymbol(),type,equal, var.id());
        }
        return variableDeclaration;
    }

    /// to check for data type mismatch in variable declaration
    private void checkMismatch(Token token , String type , Expression equal , String id){
        if(Objects.equals(type, "int"))
        {
            if((equal instanceof VariableValue )&& !(equal instanceof NumberValue))
            {

                int line = token.getLine();
                int column = token.getCharPositionInLine() + 2;
                semanticErrors.add("Error : "+ id +" type int is not settable for this value " + "(" + line + "," + column + ")");
            }
        }else if(Objects.equals(type, "double"))
        {
            if((equal instanceof VariableValue )&& !(equal instanceof DoubleValue))
            {
                int line = token.getLine();
                int column = token.getCharPositionInLine() + 2;
                semanticErrors.add("Error : "+ id +" type double is not settable for this value " + "(" + line + "," + column + ")");
            }
        }
        else if(Objects.equals(type, "String"))
        {
            if((equal instanceof VariableValue )&& !(equal instanceof StringValue))
            {
                int line = token.getLine();
                int column = token.getCharPositionInLine() + 2;
                semanticErrors.add("Error : "+ id +" type string is not settable for this value " + "(" + line + "," + column + ")");
            }
        }
        else if(Objects.equals(type, "bool"))
        {
            if((equal instanceof VariableValue )&& !(equal instanceof BooleanValue))
            {
                int line = token.getLine();
                int column = token.getCharPositionInLine() + 2;
                semanticErrors.add("Error : "+ id +" type bool is not settable for this value " + "(" + line + "," + column + ")");
            }
        }
    }

    /// (x)
    @Override public Expression visitBetweenBracket(Dart2Parser.BetweenBracketContext ctx)
    { return visit(ctx.getChild(1));}

    @Override public Expression visitIntIncrease(Dart2Parser.IntIncreaseContext ctx) {
        Variable var = new Variable(ctx.getChild(0).getText());
        boolean isIncrease = Objects.equals(ctx.getChild(1).getText(), "++");
        Token token = ctx.IDENTIFIER().getSymbol();
        final boolean[] check = {false};
        Expression equal = null;
        for (int i = 0 ; i < variables.size() ; i ++)
        {
            VariableDeclaration temp = variables.get(i);
            if(Objects.equals(temp.id().id(), var.id())) {
                if(!Objects.equals(temp.dataType(), "int") && !Objects.equals(temp.dataType(), "double"))
                {
                    int line = token.getLine();
                    int column = token.getCharPositionInLine() + 1;
                    semanticErrors.add("Error : variable " + var.id() + " isn't of type integer " + "( line : " + line + ", column : " + column + ")");
                }
                else
                {
                    if(Objects.equals(temp.dataType(), "int") ) {
                        int current = ((NumberValue) temp.value()).number();
                        equal = new NumberValue(current + (isIncrease ? 1 : -1));
                        variables.set(i, new VariableDeclaration(temp.id(), temp.dataType(), equal));
                    }else if(Objects.equals(temp.dataType(), "double") )
                    {
                        double current = ((DoubleValue) temp.value()).value();
                        equal = new DoubleValue(current + (isIncrease ? 1 : -1));
                        variables.set(i, new VariableDeclaration(temp.id(), temp.dataType(), equal));
                    }
                }
                check[0] = true;
            }
        }
        if(!check[0])
        {
            int line = token.getLine();
            int column = token.getCharPositionInLine() + 1;
            semanticErrors.add("Error : variable " + var.id() + " isn't define " + "(" + line + "," + column + ")");
        }
        return new VariableEQ(var , equal);
    }


    /// x , y
    @Override public Expression visitVariable(Dart2Parser.VariableContext ctx)
    {
        Token varToken = ctx.IDENTIFIER().getSymbol();
        String id = ctx.getChild(0).getText();
        final boolean[] check = {false};
        final VariableDeclaration[] variable = new VariableDeclaration[1];
        variables.forEach(variableDeclaration -> {
            if(Objects.equals(variableDeclaration.id().id(), id))
            {
                check[0] = true ;
                variable[0] = variableDeclaration;
            }
        });

        if(!check[0])
        {
            int line = varToken.getLine();
            int column = varToken.getCharPositionInLine() + 1;
            semanticErrors.add("variable " + id + " not define " + "(" + line + " " + column + ")");
        }

        return variable[0] == null ? new NumberValue(0) : variable[0].value() ;
    }

    ///integer
    @Override public Expression visitNumber(Dart2Parser.NumberContext ctx)
    {
        String x = ctx.getChild(0).getText();
        int number = Integer.parseInt(x);
        return new NumberValue(number);
    }


    /// x + 1 ;
    /// x + y ;
    /// x - * / + y ;
    /// 1 + 1 ;
    @Override public Expression visitMathematicsLogic(Dart2Parser.MathematicsLogicContext ctx)
    {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        Token token = ctx.MathMaticalSign().getSymbol();
        String math = ctx.getChild(1).getText();
        if(Objects.equals(math, "+"))
        {
            Addition temp = new Addition(left,right);
            if(getEvaResult(temp) == null)
            {
                int line = token.getLine();
                int column = token.getCharPositionInLine() + 1;
                semanticErrors.add("Error : type mismatch" + "( line : " + line + ", column : " + column + ")");
            }
            return temp;
        }
        else if(Objects.equals(math, "-"))
        {
            Minus temp = new Minus(left,right);
            if(getEvaResult(temp) == null)
            {
                int line = token.getLine();
                int column = token.getCharPositionInLine() + 1;
                semanticErrors.add("Error : type mismatch" + "( line : " + line + ", column : " + column + ")");
            }
            return temp;
        }
        else if(Objects.equals(math, "*"))
        {
            Multiplication temp = new Multiplication(left,right);
            if(getEvaResult(temp) == null)
            {
                int line = token.getLine();
                int column = token.getCharPositionInLine() + 1;
                semanticErrors.add("Error : type mismatch" + "( line : " + line + ", column : " + column + ")");
            }
            return temp;
        }
        else
        {
            Divide temp = new Divide(left,right);
            if(getEvaResult(temp) == null)
            {
                int line = token.getLine();
                int column = token.getCharPositionInLine() + 1;
                semanticErrors.add("Error : type mismatch" + "( line : " + line + ", column : " + column + ")");
            }
            return temp;
        }

    }


    /// to get the variables of math phrase data type to check for semantic errors
    private VariableValue getEvaResult(Expression e){
        VariableValue value = null;
        if(e instanceof NumberValue)
        {
            value = (NumberValue) e;
        }
        else if(e instanceof StringValue)
        {
            value = (StringValue) e;
        }
        else if(e instanceof DoubleValue)
        {
            value = (DoubleValue) e;
        }
        else if(e instanceof BooleanValue)
        {
            value = (BooleanValue)e;
        }
        else if(e instanceof Addition addition)
        {
            VariableValue left = getEvaResult(addition.left());
            VariableValue right = getEvaResult(addition.right());
            if(left instanceof NumberValue num1 && right instanceof NumberValue num2)
            {
                value = new NumberValue(num1.number() + num2.number());
            }
            else if(left instanceof DoubleValue val1 && right instanceof DoubleValue val2)
            {
                value = new DoubleValue(val1.value() + val2.value());
            }
            else if(left instanceof StringValue val1 && right instanceof StringValue val2)
            {
                value = new StringValue(val1.value() + val2.value());
            }
        }
        else if(e instanceof Multiplication multiplication)
        {
            VariableValue left = getEvaResult(multiplication.left());
            VariableValue right = getEvaResult(multiplication.right());
            if(left instanceof NumberValue num1 && right instanceof NumberValue num2)
            {
                value = new NumberValue(num1.number() * num2.number());
            }
        }
        else if(e instanceof Divide divide)
        {
            VariableValue left = getEvaResult(divide.left());
            VariableValue right = getEvaResult(divide.right());
            if(left instanceof NumberValue num1 && right instanceof NumberValue num2)
            {
                value = new NumberValue(num1.number() / num2.number());
            }
        }
        else if(e instanceof Minus minus)
        {
            VariableValue left = getEvaResult(minus.left());
            VariableValue right = getEvaResult(minus.right());
            if(left instanceof NumberValue num1 && right instanceof NumberValue num2)
            {
                value = new NumberValue(num1.number() - num2.number());
            }
        }
        else if(e instanceof OR or)
        {
            VariableValue left = getEvaResult(or.left());
            VariableValue right = getEvaResult(or.right());
            if(left instanceof BooleanValue bool1 && right instanceof BooleanValue bool2)
            {
                value = new BooleanValue(bool1.value() | bool2.value());
            }
        }
        else if(e instanceof AND and)
        {
            VariableValue left = getEvaResult(and.left());
            VariableValue right = getEvaResult(and.right());
            if(left instanceof BooleanValue bool1 && right instanceof BooleanValue bool2)
            {
                value = new BooleanValue(bool1.value() & bool2.value());
            }
        }
        else if(e instanceof XOR xor)
        {
            VariableValue left = getEvaResult(xor.left());
            VariableValue right = getEvaResult(xor.right());
            if(left instanceof BooleanValue bool1 && right instanceof BooleanValue bool2)
            {
                value = new BooleanValue(bool1.value() ^ bool2.value());
            }
        }
        return value;
    }


    /// x = 1;
    /// x += 1 ;
    /// x-= 1 ;
    /// x *= 1 ;
    /// x /= 1 ;
    @Override public Expression visitVarEQ(Dart2Parser.VarEQContext ctx) {
        Variable var = new Variable(ctx.getChild(0).getText());
        String equalType = ctx.getChild(1).getText();
        Token token = ctx.IDENTIFIER().getSymbol();
        String type = "";
        Expression equal = null;
        final boolean[] check = {false};
        for (int i = 0 ; i < variables.size() ; i ++)
        {
            VariableDeclaration temp = variables.get(i);
            if(Objects.equals(temp.id().id(), var.id())) {
                if(ctx.getChildCount() > 3)
                {
                    equal = differentTypeOfEqual(Objects.equals(equalType, "+=") ? MathType.plus : Objects.equals(equalType, "-=")
                                    ? MathType.minus : Objects.equals(equalType, "*=")
                                    ? MathType.multi : Objects.equals(equalType, "/=")
                                    ? MathType.divide : MathType.equal
                            ,variables.get(i).value(),visit(ctx.getChild(2))
                            ,(ctx.EQ() == null ? ctx.EQFORNORMALMATH() : ctx.EQ()).getSymbol());
                }
                variables.set(i,new VariableDeclaration(temp.id() , temp.dataType() , equal));
                check[0] = true;
                type = temp.dataType();
            }
        }
        if(!check[0])
        {
            int line = token.getLine();
            int column = token.getCharPositionInLine() + 1;
            semanticErrors.add("Error : variable " + var.id() + " isn't define " + "(" + line + "," + column + ")");
        }

        if(equal != null && !Objects.equals(type, ""))
        {
            checkMismatch((ctx.EQ() == null ? ctx.EQFORNORMALMATH() : ctx.EQ()).getSymbol(),type,equal, var.id());
        }
        return new VariableEQ(var , equal);
    }


    /// += -= *= /= =
    /// and handle the logic of them
    private Expression differentTypeOfEqual(MathType math , Expression value , Expression value2 , Token token){
        if(value instanceof StringValue && value2 instanceof StringValue)
        {
            if(math == MathType.plus)
            {
                value = new StringValue(((StringValue) value).value() + ((StringValue) value2).value());
            }
            else if(math == MathType.equal)
            {
                value = value2;
            }else
            {
                int line = token.getLine();
                int column = token.getCharPositionInLine() + 1;
                semanticErrors.add("Error you can't do that at type string at ( line : "+ line + " , column : " +column + ")");
            }
        }
        else if(value instanceof DoubleValue && value2 instanceof DoubleValue)
        {
            if(math == MathType.plus)
            {
                value = new DoubleValue(((DoubleValue) value).value() + ((DoubleValue) value2).value());
            }
            else if (math == MathType.divide)
            {
                value = new DoubleValue(((DoubleValue) value).value() / ((DoubleValue) value2).value());
            }
            else if(math == MathType.multi)
            {
                value = new DoubleValue(((DoubleValue) value).value() * ((DoubleValue) value2).value());
            }
            else if(math == MathType.minus)
            {
                value = new DoubleValue(((DoubleValue) value).value() - ((DoubleValue) value2).value());
            }
            else if(math == MathType.equal)
            {
                value = value2;
            }
        }
        else if(value instanceof NumberValue && value2 instanceof NumberValue )
        {
            if(math == MathType.plus)
            {
                value = new NumberValue(((NumberValue) value).number() + ((NumberValue) value2).number());
            }
            else if (math == MathType.divide)
            {
                value = new NumberValue(((NumberValue) value).number() / ((NumberValue) value2).number());
            }
            else if(math == MathType.multi)
            {
                value = new NumberValue(((NumberValue) value).number() * ((NumberValue) value2).number());
            }
            else if(math == MathType.minus)
            {
                value = new NumberValue(((NumberValue) value).number() - ((NumberValue) value2).number());
            }
            else
            {
                value = value2;
            }
        }
        else if(value2 instanceof VariableValue)
        {
            int line = token.getLine();
            int column = token.getCharPositionInLine() + 1;
            semanticErrors.add("Error : " + value2.getType() + " is not settable for type " + value.getType() + " ( line : "+ line + " , column : " +column + ")");
        }
        return value;
    }

    @Override public Expression visitDouble(Dart2Parser.DoubleContext ctx) {
        String x = ctx.getChild(0).getText();
        double number = Double.parseDouble(x);
        return new DoubleValue(number);
    }
    @Override public Expression visitString(Dart2Parser.StringContext ctx) {
        String x = ctx.getChild(0).getText();
        String st = x.substring(1 , x.length() - 1);
        return new StringValue(st);
    }





    ///// ***************************** boolean


    @Override public Expression visitBool(Dart2Parser.BoolContext ctx) {
        return new BooleanValue(Objects.equals(ctx.getChild(0).getText(), "true"));
    }
    @Override public Expression visitBoolVariable(Dart2Parser.BoolVariableContext ctx) {
        Token varToken = ctx.IDENTIFIER().getSymbol();
        String id = ctx.getChild(0).getText();
        final boolean[] check = {false};
        final VariableDeclaration[] variable = new VariableDeclaration[1];
        variables.forEach(variableDeclaration -> {
            if(Objects.equals(variableDeclaration.id().id(), id))
            {
                check[0] = true ;
                variable[0] = variableDeclaration;
            }
        });

        if(!check[0])
        {
            int line = varToken.getLine();
            int column = varToken.getCharPositionInLine() + 1;
            semanticErrors.add("variable " + id + " not define " + "(" + line + " " + column + ")");
        }

        return variable[0] == null ? new NumberValue(0) : variable[0].value() ;
    }

    @Override public Expression visitBoolBetweenBracket(Dart2Parser.BoolBetweenBracketContext ctx)
    { return visit(ctx.getChild(1));}

    @Override public Expression visitBoolMathematicsLogic(Dart2Parser.BoolMathematicsLogicContext ctx)
    {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        Token token = ctx.BooleanSign().getSymbol();
        String math = ctx.getChild(1).getText();
        if(Objects.equals(math, "|"))
        {
            OR temp = new OR(left,right);
            if(getEvaResult(temp) == null)
            {
                int line = token.getLine();
                int column = token.getCharPositionInLine() + 1;
                semanticErrors.add("Error : type mismatch" + "( line : " + line + ", column : " + column + ")");
            }
            return temp;
        }
        else if(Objects.equals(math, "&"))
        {
            AND temp = new AND(left,right);
            if(getEvaResult(temp) == null)
            {
                int line = token.getLine();
                int column = token.getCharPositionInLine() + 1;
                semanticErrors.add("Error : type mismatch" + "( line : " + line + ", column : " + column + ")");
            }
            return temp;
        }
        else if(Objects.equals(math, "^")){
            XOR temp = new XOR(left,right);
            if(getEvaResult(temp) == null)
            {
                int line = token.getLine();
                int column = token.getCharPositionInLine() + 1;
                semanticErrors.add("Error : type mismatch" + "( line : " + line + ", column : " + column + ")");
            }
            return temp;
        }
        return null;
    }

    @Override public Expression visitBoolVarDefnition(Dart2Parser.BoolVarDefnitionContext ctx)
    {
        Token varToken = ctx.IDENTIFIER().getSymbol();
        Variable var = new Variable(ctx.getChild(1).getText());
        String type = ctx.getChild(0).getText();
        Expression equal = null;
        if(ctx.getChildCount() > 3)
        {
            equal = visit(ctx.getChild(3));
        }
        VariableDeclaration variableDeclaration = new VariableDeclaration(var,type,equal);
        final boolean[] check = {false};
        for (VariableDeclaration temp : variables) {
            if (Objects.equals(temp.id().id(), var.id())) {
                check[0] = true;
                break;
            }
        }
        if(check[0])
        {
            int line = varToken.getLine();
            int column = varToken.getCharPositionInLine() + 1;
            semanticErrors.add("Error : variable " + var.id() + " already declared" + "(" + line + "," + column + ")");
        }
        else {
            variables.add(variableDeclaration);
        }
        if(equal != null)
        {
            checkMismatch(ctx.EQ().getSymbol(),type,equal, var.id());
        }
        return variableDeclaration;
    }

    @Override public Expression visitBoolVarEq(Dart2Parser.BoolVarEqContext ctx)
    {
        Variable var = new Variable(ctx.getChild(0).getText());
        String equalType = ctx.getChild(1).getText();
        Token token = ctx.IDENTIFIER().getSymbol();
        String type = "";
        Expression equal = null;
        final boolean[] check = {false};
        for (int i = 0 ; i < variables.size() ; i ++)
        {
            VariableDeclaration temp = variables.get(i);
            if(Objects.equals(temp.id().id(), var.id())) {
                if(ctx.getChildCount() > 3)
                {
                    equal = boolDifferentTypeOfEqual(Objects.equals(equalType, "|=") ? MathType.orEqual : Objects.equals(equalType, "&=")
                                    ? MathType.andEqual : Objects.equals(equalType, "^=")
                                    ? MathType.xorEqual : Objects.equals(equalType, "!=")
                                    ? MathType.notEqual : MathType.equal
                            ,variables.get(i).value(),visit(ctx.getChild(2))
                            ,(ctx.EQ() == null ? ctx.EQFORBOOLEANMATH() : ctx.EQ()).getSymbol());
                }
                variables.set(i,new VariableDeclaration(temp.id() , temp.dataType() , equal));
                check[0] = true;
                type = temp.dataType();
            }
        }
        if(!check[0])
        {
            int line = token.getLine();
            int column = token.getCharPositionInLine() + 1;
            semanticErrors.add("Error : variable " + var.id() + " isn't define " + "(" + line + "," + column + ")");
        }

        if(equal != null && !Objects.equals(type, ""))
        {
            checkMismatch((ctx.EQ() == null ? ctx.EQFORBOOLEANMATH() : ctx.EQ()).getSymbol(),type,equal, var.id());
        }
        return new VariableEQ(var , equal);
    }
    private Expression boolDifferentTypeOfEqual(MathType math , Expression value , Expression value2 , Token token){
        if(value instanceof BooleanValue && value2 instanceof BooleanValue)
        {
            if(math == MathType.orEqual)
            {
                value = new BooleanValue(((BooleanValue) value).value() | ((BooleanValue) value2).value());
            }
            else if(math == MathType.andEqual)
            {
                value = new BooleanValue(((BooleanValue) value).value() & ((BooleanValue) value2).value());
            }
            else if(math == MathType.xorEqual)
            {
                value = new BooleanValue(((BooleanValue) value).value() ^ ((BooleanValue) value2).value());
            }
            else if(math == MathType.notEqual)
            {
                value = new BooleanValue(!((BooleanValue) value2).value());
            }
            else if(math == MathType.equal)
            {
                value = value2;
            }else
            {
                int line = token.getLine();
                int column = token.getCharPositionInLine() + 1;
                semanticErrors.add("Error you can't do that at type string at ( line : "+ line + " , column : " +column + ")");
            }
        }
        else if(value2 instanceof VariableValue)
        {
            int line = token.getLine();
            int column = token.getCharPositionInLine() + 1;
            semanticErrors.add("Error : " + value2.getType() + " is not settable for type " + value.getType() + " ( line : "+ line + " , column : " +column + ")");
        }
        return value;
    }

}

