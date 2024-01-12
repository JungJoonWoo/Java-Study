package super1.ex;

public class ShopMain {
    public static void main(String[] args) {
        Book book = new Book("Java", 10000, "홍길동", "1234-5678-9012");
        Album album = new Album("아이유", 20000, "좋은날");
        Movie movie = new Movie("테넷", 30000, "크리스토퍼 놀란", "존 데이비드 워싱턴");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("총 가격 = " + sum);
    }
}