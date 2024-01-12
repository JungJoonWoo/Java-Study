package access.ex;

public class ShoppingCart {
    private final Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if (itemCount >= items.length - 1) {
            System.out.println("카트 용량 초과");
            return;
        }
        items[itemCount++] = item;
    }

    public void displayItems() {

        for (int i = 0; i < itemCount; i++) {
            System.out.println("상품명: " + items[i].getName() + "합계: " + items[i].getTotalPrice());
        }
        System.out.println("총 가격: " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }

}