package expression;

public record Variable(String id) implements Expression {
    @Override
    public String getType() {
        return "Variable";
    }
}
