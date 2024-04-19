package kosta.week1;

import java.io.*;

public class ex2 {
  public static void main(String[] args) throws IOException {
    BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    int[] result = new int[26];
    String input = r.readLine();
    char arr[] = input.toCharArray();

    for (char c : arr) {
      int n = c - 'a';
      result[n]++ ;
    }

    for (int i : result) {
      w.write(i + " ");
    }
    w.flush();
    w.close();
    r.close();


  }
}