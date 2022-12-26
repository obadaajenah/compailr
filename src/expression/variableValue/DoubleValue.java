package expression.variableValue;

public record DoubleValue(double value) implements VariableValue {
    @Override public String getType()
    {
        return "double";
    }
}
