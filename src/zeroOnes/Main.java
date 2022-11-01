package zeroOnes;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Action action = new Action(scan.next());
        action.action();


    }
}
