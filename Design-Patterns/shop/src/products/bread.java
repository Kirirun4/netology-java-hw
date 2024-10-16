package products;

import base.*;

public class bread extends commodity implements food {
    private final String name = "хлеб";
    private final int price = 50;

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
        System.out.println("Свежий хлеб");
    }

    @Override
    public void check() {
        System.out.println("Проверка, срока годности.");
    }
}