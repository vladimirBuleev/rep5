package Calc2;

public class ActionFactory {
    public Operation create(OperationType type) {
        if (type == OperationType.ADD) {
            return new Add();
        } else if (type == OperationType.SUB) {
            return new Sub();
        } else if (type == OperationType.MULTIPLY) {
            return new Multiply();
        } else if (type == OperationType.DIVISION) {
            return new Division();
        }else {
            return new WrongAnswer();
        }
    }
}
