package base;

public abstract class commodity {
    String name;
    int price;
    int number;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int count) {
        this.number += count;
    }

    @Override
    public String toString() {
        return name;
    }
}