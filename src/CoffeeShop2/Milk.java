package CoffeeShop2;

public class Milk implements IProduct {
    IProduct product;

    public Milk(IProduct product) {
        this.product = product;
    }

    @Override
    public String getName() {
        return product.getName()+" c молоком";
    }

    @Override
    public int getPrice() {
        return product.getPrice()+5;

    }
}
