package string_calculator;

public class StringCalculatorException extends Exception {

    String message = "";

    StringCalculatorException(String message) {
        this.message = message;
    }
}
