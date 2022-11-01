package Calc2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Elements elements = new Elements();
        Action action = new Action();
        elements.setX(scan.nextDouble());
        Operation calc = action.fabric(OperationType.ADD.getOperationType(scan.next()));
        elements.setY(scan.nextDouble());
        System.out.println(calc.operate(elements.getX(), elements.getY()));

    }
}
