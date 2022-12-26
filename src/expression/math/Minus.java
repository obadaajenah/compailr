package expression.math;

import expression.Expression;

public record Minus(Expression left, Expression right) implements Expression {
    @Override public String getType()
    {
        return "minus";
    }
}
