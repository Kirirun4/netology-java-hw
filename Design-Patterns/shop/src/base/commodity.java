package base;

public abstract class commodity {
    String name;
    int price;
    int count;
    String groupe;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public String getGroupe() {
        return name;
    }

    public void setCount(int count) {
        this.count += count;
    }

    @Override
    public String toString() {
        return name;
    }
}