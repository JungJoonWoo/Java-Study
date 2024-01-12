package construct;

public class BookMain {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("hello java", "seo");
        Book b3 = new Book("JPA", "kim", 700);

        b1.displayInfo();
        b2.displayInfo();
        b3.displayInfo();
    }
}