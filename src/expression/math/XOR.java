package expression.math;

import expression.Expression;

public record XOR(Expression left, Expression right) implements Expression {
    @Override
    public String getType() {
        return "xor";
    }
}
