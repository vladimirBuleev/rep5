package CoffeeShop2;

public class Tea implements IProduct{
    @Override
    public String getName() {
        return "Чай";
    }

    @Override
    public int getPrice() {
        return 8;
    }
}
