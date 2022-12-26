package expression.variableValue;

public record BooleanValue(boolean value) implements VariableValue {
    @Override public String getType()
    {
        return "bool";
    }
}
