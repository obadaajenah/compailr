package expression;

import expression.variableValue.VariableValue;

public record VariableDeclaration(Variable id, String dataType, Expression value) implements Expression {

    @Override
    public String getType() {
        return "Variable Declaration";
    }
}
