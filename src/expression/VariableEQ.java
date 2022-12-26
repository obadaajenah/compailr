package expression;

public record VariableEQ(Variable id, Expression value) implements Expression {

    @Override
    public String getType() {
        return "VariableEQ";
    }
}
