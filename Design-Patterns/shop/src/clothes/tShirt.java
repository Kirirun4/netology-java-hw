package clothes;

import base.*;

public class tShirt extends commodity implements clothes, check {
    private final String name = "футболка";
    private final int price = 3500;

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
    public void clothes() {
        System.out.println("Футболка сидит отлично");
    }

    @Override
    public void check() {
        System.out.println("Примерка футболки");
    }
}
