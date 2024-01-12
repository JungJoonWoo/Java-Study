package super1.ex;

public class Item {
    private final String Name;
    private final int price;

    public Item(String Name, int price) {
        this.Name = Name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void print() {
        System.out.print("Name: " + Name + ", Price: " + price + ", ");
    }
}