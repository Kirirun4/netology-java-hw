package clothes;

import base.*;

public class shirt extends commodity implements clothes {
    private final String name = "рубашка";
    private final int price = 5000;

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
        System.out.println("Рубашка сидит отлично");
    }

    @Override
    public void check() {
        System.out.println("Примерка рубашки");
    }
}
