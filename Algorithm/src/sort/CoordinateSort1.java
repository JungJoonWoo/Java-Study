package sort;
/*
1. Arrays.sort에 Comparator 사용해 오버라이딩
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

import static java.lang.Integer.parseInt;

public class CoordinateSort1 {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = parseInt(r.readLine());
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(r.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());

        }
        Arrays.sort(arr, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return Integer.compare(o1[1],o2[1]);
                } else {
                    return Integer.compare(o1[0],o2[0]);
                }
            }
        });
        for (int[] ints : arr) {
            w.write(ints[0] + " " + ints[1] + "\n");
        }
        w.flush();
        w.close();
        r.close();
    }
}