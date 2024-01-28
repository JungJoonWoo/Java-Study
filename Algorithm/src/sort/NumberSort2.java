package sort;

import java.io.*;
import java.util.Arrays;

public class NumberSort2 {
    public static void main(String[] args) throws Exception {
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(r.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(r.readLine());

        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {

            w.write(arr[i] + "\n");
        }
        w.flush();
        w.close();
        r.close();
    }
}