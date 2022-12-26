package expression;

import expression.Expression;
import expression.Variable;
import expression.VariableDeclaration;
import expression.math.*;
import expression.variableValue.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpressionProcessor {

    List<Expression> li ;
    public Map<String , VariableValue> values ;

    public ExpressionProcessor(List<Expression> li)
    {
        this.li = li ;
        values = new HashMap<>();
    }

    public List<String> getResult(){
        List<String> evaluation  = new ArrayList<>();
        for (Expression expression: li) {
//            System.out.println(expression);
            if(expression instanceof VariableDeclaration)
            {
                VariableDeclaration e = (VariableDeclaration) expression;
                VariableValue temp = getEvaResult(e.value());
//                System.out.println(temp);
                values.put(e.id().id(),temp);
            }
            else if(expression instanceof VariableEQ){
                VariableEQ e = (VariableEQ) expression;
                VariableValue temp = getEvaResult(e.value());
//                System.out.println(temp);
                values.replace(e.id().id(),temp);
            }
            else
            {
                String input = expression.toString();
                VariableValue result = getEvaResult(expression);
                evaluation.add(input + " is " + result);
            }
        }
        return evaluation ;
    }
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
        else if(e instanceof Variable)
        {
            Variable v = (Variable) e;
            value = values.get(v.id());
        }
        else if(e instanceof Addition)
        {
            Addition addition = (Addition) e;
            VariableValue left = getEvaResult(addition.left());
            VariableValue right = getEvaResult(addition.right());
            if(left instanceof NumberValue && right instanceof NumberValue)
            {
                NumberValue num1 = (NumberValue)left;
                NumberValue num2 = (NumberValue)right;
                value = new NumberValue(num1.number() + num2.number());
            }
            else if(left instanceof DoubleValue && right instanceof DoubleValue)
            {
                DoubleValue val1 = (DoubleValue)left;
                DoubleValue val2 = (DoubleValue)right;
                value = new DoubleValue(val1.value() + val2.value());
            }
            else if(left instanceof StringValue && right instanceof StringValue)
            {
                StringValue val1 = (StringValue)left;
                StringValue val2 = (StringValue)right;
                value = new StringValue(val1.value() + val2.value());
            }
        }
        else if(e instanceof Multiplication)
        {
            Multiplication multiplication = (Multiplication) e;
            VariableValue left = getEvaResult(multiplication.left());
            VariableValue right = getEvaResult(multiplication.right());
            if(left instanceof NumberValue && right instanceof NumberValue)
            {
                NumberValue num1 = (NumberValue)left;
                NumberValue num2 = (NumberValue)right;
                value = new NumberValue(num1.number() * num2.number());
            }
        }
        else if(e instanceof Divide)
        {
            Divide divide = (Divide) e;
            VariableValue left = getEvaResult(divide.left());
            VariableValue right = getEvaResult(divide.right());
            if(left instanceof NumberValue && right instanceof NumberValue)
            {
                NumberValue num1 = (NumberValue)left;
                NumberValue num2 = (NumberValue)right;
                value = new NumberValue(num1.number() / num2.number());
            }
        }
        else if(e instanceof Minus)
        {
            Minus minus = (Minus) e;
            VariableValue left = getEvaResult(minus.left());
            VariableValue right = getEvaResult(minus.right());
            if(left instanceof NumberValue && right instanceof NumberValue)
            {
                NumberValue num1 = (NumberValue)left;
                NumberValue num2 = (NumberValue)right;
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
}
