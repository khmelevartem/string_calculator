package string_calculator;

public class Request {

    String firstArg;
    String secondArgString;
    int secondArgInt;
    Operation operation;
    boolean secondArgIsNumeric = false;

    Request(String firstArg, String secondArg, Operation operation) {
        this.firstArg = firstArg;
        this.secondArgString = secondArg;
        this.operation = operation;
    }

    Request(String firstArg, int secondArg, Operation operation) {
        this.firstArg = firstArg;
        this.secondArgInt = secondArg;
        this.secondArgString = Integer.toString(secondArg);
        this.operation = operation;
        secondArgIsNumeric = true;
    }
}
