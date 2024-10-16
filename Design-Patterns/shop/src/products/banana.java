package products;

import base.*;

public class banana extends commodity implements food, check {
    private final String name = "бананы";
    private final int price = 120;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void food() {
        System.out.println("Свежие бананы");
    }

    @Override
    public void check() {
        System.out.println("Проверка, срока годности.");
    }
}
