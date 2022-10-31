package CoffeeShop2;

public class Coffee implements IProduct{
    @Override
    public String getName() {
        return "Кофе";
    }

    @Override
    public int getPrice() {
        return 10;
    }
}
