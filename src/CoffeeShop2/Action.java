package CoffeeShop2;

public class Action {
    public IProduct[] product;

    public Action(IProduct[] product) {
        this.product = product;
    }

    public void position() {
        for (int i = 0; i < product.length; i++) {
            System.out.println(i + " "+product[i].getName()+" - "+product[i].getPrice());
        }

    }public void result(int value){
        if(value>=product.length){
            System.out.println("wrong answer");
        }else{
            System.out.println("Ваш выбор- "+product[value].getName()+".С вас- "+product[value].getPrice());
        }
    }

}
