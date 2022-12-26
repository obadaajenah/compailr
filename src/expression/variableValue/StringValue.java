package expression.variableValue;

public record StringValue(String value) implements VariableValue {
    @Override public String getType()
    {
        return "String";
    }
}
