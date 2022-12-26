package expression.variableValue;

public record NumberValue(int number) implements VariableValue {
    @Override public String getType()
    {
        return "integer";
    }
}

