package string_calculator;

import java.util.Scanner;

public class ConsoleAssistant {
    static final String QUIT = "q";

    private final Scanner input = new Scanner(System.in);

    void greet() {
        println("Hello! Write down your request. For quit print \"" + QUIT + "\"");
    }

    String waitForNextInput() {
        print("Input: ");
        return input.nextLine();
    }

    void answer(String result) {
        println("Output: " + result);
    }

    void error(StringCalculatorException error) {
//        error.printStackTrace();
        println("Incorrect request: " + error.message);
    }

    void goodbye() {
        println("Buy!");
        input.close();
    }

    private void println(String string) {
        System.out.println(string);
    }

    private void print(String string) {
        System.out.print(string);
    }
}
