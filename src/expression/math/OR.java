package expression.math;

import expression.Expression;

public record OR(Expression left, Expression right) implements Expression {

    @Override
    public String getType() {
        return "OR";
    }
}
