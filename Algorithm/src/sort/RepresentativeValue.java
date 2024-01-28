package sort;
/*

 */
import java.io.*;
import java.util.*;

public class RepresentativeValue {
    public static void main(String[] args) throws Exception {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(r.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr);
        w.write((int)(sum/arr.length) + "\n");
        w.write(arr[2] + "\n");
        w.flush();
        w.close();
        r.close();
    }
}