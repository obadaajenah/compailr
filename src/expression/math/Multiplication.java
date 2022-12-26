package expression.math;

import expression.Expression;

public record Multiplication(Expression left, Expression right) implements Expression {
    @Override public String getType()
    {
        return "multiplication";
    }
}
