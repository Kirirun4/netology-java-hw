package products;

import base.commodity;

public class bread extends commodity implements products {
    private final String name = "хлеб";
    private final int price = 50;
    private final String groupe = "bread";

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
        System.out.println("Свежий хлеб");
    }

    @Override
    public void check() {
        System.out.println("Проверка, срока годности.");
    }
}