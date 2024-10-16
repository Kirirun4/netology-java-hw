package products;

import base.*;

public class apple extends commodity implements food {
    private final String name = "яблоки";
    private final int price = 100;

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
        System.out.println("Свежие яблоки");
    }

    @Override
    public void check() {
        System.out.println("Проверка, срока годности.");
    }
}
