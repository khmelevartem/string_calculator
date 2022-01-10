package string_calculator;

public class CalculationSeance {
    private final ConsoleAssistant assistant = new ConsoleAssistant();
    private final Parser parser = new Parser();
    private final StringCalculator calculator = new StringCalculator();

    public static void main(String[] args) {
        new CalculationSeance().start();
    }

    public void start() {
        assistant.greet();
        do {
            String input = assistant.waitForNextInput();
            if (input.equals(ConsoleAssistant.QUIT)) finish();
            try {
                Request request = parser.parse(input);
                String result = calculator.calculate(request);
                assistant.answer(result);
            } catch (StringCalculatorException e) {
                assistant.error(e);
            }
        } while (true);
    }

    public void finish() {
        assistant.goodbye();
        System.exit(1);
    }
}
