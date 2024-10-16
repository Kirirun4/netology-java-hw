package clothes;

import base.*;

public class windbreaker extends commodity implements clothes, outerwear, check {
    private final String name = "ветровка";
    private final int price = 6000;

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
        System.out.println("Ветровка сидит отлично");
    }

    @Override
    public void outerwear() {
        System.out.println("Ветровка защищает от ветра");

    }

    @Override
    public void check() {
        System.out.println("Примерка ветровки");
    }
}
