package string_calculator;

public class Parser {

    private final static String QUOTE = "\""; // кавычка
    private final static String STRING = ".*"; // любая строка
    private final static String SYMBOL = "\\s*\\S\\s*"; // 1 символ, окруженный пробелами
    private final static String REGEX = QUOTE + STRING + QUOTE + SYMBOL + QUOTE + STRING + QUOTE;

    public Request parse(String input) throws StringCalculatorException {
        if (!formattedCorrectly(input)) throw new StringCalculatorException("Input format is not correct: " + input);
        String[] strings = input.split(QUOTE);
        String firstArg = strings[1];
        Operation operation = Operation.fromSymbol(singleChar(strings[2]));
        String secondArg = strings[3];
        try {
            int secondArgInt = Integer.parseInt(secondArg.trim());
            return new Request(firstArg, secondArgInt, operation);
        } catch (NumberFormatException e) {
            return new Request(firstArg, secondArg, operation);
        }
    }

    private boolean formattedCorrectly(String input) {
        return input.matches(REGEX);
    }

    private char singleChar(String string) {
        return string.trim().charAt(0);
    }

}
