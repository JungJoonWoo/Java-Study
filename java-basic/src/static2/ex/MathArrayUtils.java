package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {

    }

    static public int sum(int[] a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    static public double average(int[] a) {
        return (double) sum(a) / a.length;
    }

    static public int min(int[] a) {
        int min = a[0];
        for (int i : a) {
            if (min > i)
                min = i;
        }
        return min;
    }

    static public int max(int[] a) {
        int max = a[0];
        for (int i : a) {
            if (max < i)
                max = i;
        }
        return max;
    }
}