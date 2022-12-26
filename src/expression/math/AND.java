package expression.math;

import expression.Expression;

public record AND(Expression left, Expression right) implements Expression {

    @Override
    public String getType() {
        return "and";
    }
}
