package CoffeeShop2;

public class Cinnamon implements IProduct {
    private final IProduct product;
    public Cinnamon(IProduct product){
        this.product=product;
    }
    @Override
    public String getName() {
        return product.getName()+" с корицей";
    }

    @Override
    public int getPrice() {
        return product.getPrice()+2;
    }
}
