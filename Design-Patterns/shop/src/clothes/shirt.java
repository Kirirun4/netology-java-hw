package clothes;

import base.commodity;

public class shirt extends commodity implements clothes {
    private final String name = "рубашка";
    private final int price = 5000;
    private final String groupe = "shirt";

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
    public void clothes() {
        System.out.println("Рубашка сидит отлично");
    }

    @Override
    public void check() {
        System.out.println("Примерка рубашки");
    }
}
