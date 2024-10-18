package products;

import base.commodity;

public class milk extends commodity implements products {
    private final String name = "молоко";
    private final int price = 70;
    private final String groupe = "milk";

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
        System.out.println("Свежее молоко");
    }

    @Override
    public void check() {
        System.out.println("Проверка, срока годности.");
    }
}