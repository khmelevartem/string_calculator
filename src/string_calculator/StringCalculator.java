package string_calculator;

public class StringCalculator {

    public String calculate(Request request) throws StringCalculatorException {
        switch (request.operation) {
            case PLUS -> {
                return plus(request.firstArg, request.secondArgString);
            }
            case MINUS -> {
                return minus(request.firstArg, request.secondArgString);
            }
            case MULTIPLY -> {
                if (request.secondArgIsNumeric) return multiply(request.firstArg, request.secondArgInt);
                else throw new StringCalculatorException("Cannot multiply by string: " + request.secondArgString);
            }
            case DIVIDE -> {
                if (request.secondArgIsNumeric) return divide(request.firstArg, request.secondArgInt);
                else throw new StringCalculatorException("Cannot divide by string: " + request.secondArgString);
            }
        }
        return null;
    }

    private String plus(String first, String second) {
        return first + second;
    }

    private String minus(String firstArg, String secondArgString) {
        return firstArg.replaceFirst(secondArgString, "");
    }

    private String multiply(String firstArg, int times) {
        return firstArg.repeat(Math.max(0, times));
    }

    private String divide(String firstArg, int times) {
        int newLength = firstArg.length() / times;
        return firstArg.substring(0, newLength);
    }
}
