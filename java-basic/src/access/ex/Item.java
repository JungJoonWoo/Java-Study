package access.ex;

public class Item {
    private final String name;
    private final int quantity;
    private final int price;

    public Item(String name, int quantity, int price) {

        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public int getTotalPrice() {
        return price * quantity;
    }
}