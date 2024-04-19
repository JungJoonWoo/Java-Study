package kosta.week1;

import java.io.*;
import java.util.StringTokenizer;

public class ex8 {
  public static void main(String[] args) throws IOException {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(r.readLine());

    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(r.readLine());
    int[] input = new int[n];
    int max = -101 * st.countTokens();
    for (int i = 0; i < n; i++) {
      input[i] = Integer.parseInt(st.nextToken());
      if (i >= k - 1) {
        int temp = 0;
        for (int j = i - k + 1; j <= i; j++) {
          temp += input[j];
        }
        max = Math.max(max, temp);
      }
    }
    w.write(String.valueOf(max));
    w.flush();
    w.close();
    r.close();
  }
}