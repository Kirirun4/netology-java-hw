package clothes;

import base.commodity;

public class tShirt extends commodity implements clothes {
    private final String name = "футболка";
    private final int price = 3500;
    private final String groupe = "tShirt";

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
        System.out.println("Футболка сидит отлично");
    }

    @Override
    public void check() {
        System.out.println("Примерка футболки");
    }
}
