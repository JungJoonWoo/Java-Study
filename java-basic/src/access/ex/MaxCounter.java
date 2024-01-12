package access.ex;

public class MaxCounter {
    private final int max;
    private int count;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (count >= max) {
            System.out.println("최댓값을 초과할 수 없습니다.");
            return;
        }
        count++;

    }

    public void getCount() {
        System.out.println(count);
    }
}