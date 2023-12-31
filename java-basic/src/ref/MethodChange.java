package ref;

public class MethodChange {
    public static void main(String[] args) {
        int a = 10;
        System.out.printf("함수 호출 전 a = %d\n", a);
        changeValue(a);
        System.out.printf("함수 호출 후 a = %d\n", a);
    }

    static void changeValue(Integer a) {
        a = 20;
        System.out.println(a);
    }
}