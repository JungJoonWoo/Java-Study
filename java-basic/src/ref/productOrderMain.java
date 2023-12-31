package ref;

import java.util.Scanner;

public class productOrderMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 주문 갯수를 입력하시오: ");
        int num = sc.nextInt();

        ProductOrder[] products = new ProductOrder[num];
        for (int i = 0; i < products.length; i++) {
            sc.nextLine();

            System.out.print("이름을 입력하시오: ");
            String name = sc.nextLine();
            System.out.print("가격을 입력하시오: ");
            int price = sc.nextInt();
            System.out.print("구매 수량을 입력하시오: ");
            int quantity = sc.nextInt();

            products[i] = createOrder(name, price, quantity);
        }

        printOrder(products);

        int totalAmount = getTotalAmount(products);

        System.out.println("\nTotal Amount: " + totalAmount);

    }

    public static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder product = new ProductOrder();
        product.productName = productName;
        product.price = price;
        product.quantity = quantity;
        return product;
    }

    public static void printOrder(ProductOrder[] order) {
        for (ProductOrder productOrder : order) {
            System.out.printf("\n상품명: %s\n상품 가격: %d\n주문 수량:%d\n", productOrder.productName, productOrder.price, productOrder.quantity);
        }
    }

    public static int getTotalAmount(ProductOrder[] order) {
        int totalAmount = 0;
        for (ProductOrder productOrder : order) {
            totalAmount += productOrder.price * productOrder.quantity;
        }
        return totalAmount;
    }
}