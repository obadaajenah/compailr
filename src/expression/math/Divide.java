
package expression.math;

        import expression.Expression;

public record Divide(Expression left, Expression right) implements Expression {
        @Override public String getType()
        {
                return "divide";
        }
}
