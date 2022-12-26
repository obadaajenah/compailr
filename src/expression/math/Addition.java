package expression.math;

import expression.Expression;
import expression.variableValue.VariableValue;

public record Addition(Expression left, Expression right) implements Expression {
    @Override public String getType()
    {
        return "addition";
    }
}
