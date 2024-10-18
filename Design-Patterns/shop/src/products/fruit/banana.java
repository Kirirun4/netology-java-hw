package products.fruit;

import base.commodity;

public class banana extends commodity implements fruit {
    private final String name = "бананы";
    private final int price = 120;
    private final String groupe = "banana";

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getGroupe() {
        return groupe;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void products() {
        System.out.println("Свежие бананы");
    }

    @Override
    public void fruit() {
        System.out.println("Полезные");
    }

    @Override
    public void check() {
        System.out.println("Проверка, срока годности.");
    }
}
