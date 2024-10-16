package products;

import base.*;

public class milk extends commodity implements food, check {
    private final String name = "молоко";
    private final int price = 70;

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
        System.out.println("Свежее молоко");
    }

    @Override
    public void check() {
        System.out.println("Проверка, срока годности.");
    }
}