package static2.ex;

public class Car {
    public static int totalCars;
    private final String name;

    public Car(String name) {
        this.name = name;
        totalCars++;
        System.out.println("차량 구매, 구매한 차량: " + this.name);
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + totalCars);
    }
}