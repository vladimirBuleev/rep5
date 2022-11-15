package CoffeeShop2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Action action = new Action(new IProduct[]{
                new Tea(),
                new Coffee(),
                new Milk(new Coffee()),
                new Milk(new Tea()),
                new Cinnamon(new Milk(new Coffee())),
                new Cinnamon(new Milk(new Tea())),
        });
        Scanner scan = new Scanner(System.in);
        action.position();
        action.result(scan.nextInt());

    }
}
