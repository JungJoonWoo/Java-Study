package super1.ex;

public class Album extends Item {
    private final String artist;

    public Album(String name, int price, String artist) {
        super(name, price);
        this.artist = artist;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Artist: " + artist);
    }
}