package Calc2;

public class WrongAnswer implements Operation {
    @Override
    public double operate(double x, double y) {
        System.out.println("По новой Миша, все херня");
        return 0;
    }
}
