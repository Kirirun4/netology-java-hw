package products.fruit;

import base.commodity;

public class apple extends commodity implements fruit {
    private final String name = "яблоки";
    private final int price = 100;
    private final String groupe = "apple";

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
        System.out.println("Свежие яблоки");
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
