package kosta.week1;

import java.io.*;
import java.util.Arrays;

public class ex1 {

  public static void main(String[] args) throws IOException {
    BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    int[] input = new int[9];
    int sum = 0;
    for (int i = 0; i < 9; i++) {
      input[i] = Integer.parseInt(r.readLine());
      sum += input[i];
    }
    Arrays.sort(input);
    for (int i = 0; i < 9; i++) {
      for (int j = i + 1; j < 9; j++) {
        if (sum - input[i] - input[j] == 100) {
          for (int k = 0; k < 9; k++) {
            if (k != i && k != j) { // 조건을 수정하여, i와 j가 아닌 경우에만 출력합니다.
              w.write(input[k] + "\n");
            }
          }
          w.flush();
          w.close();
          r.close();
          return; // 올바른 난쟁이들을 찾으면 반복문을 종료합니다.
        }
      }
    }
  }
}