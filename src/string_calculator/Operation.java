package string_calculator;

public enum Operation {
    PLUS, MINUS, MULTIPLY, DIVIDE;

    public static Operation fromSymbol(char symbol) throws StringCalculatorException {
        return switch (symbol) {
            case '+' -> PLUS;
            case '-' -> MINUS;
            case '*' -> MULTIPLY;
            case '/' -> DIVIDE;
            default -> throw new StringCalculatorException("Unknown operation symbol: " + symbol);
        };
    }
}
