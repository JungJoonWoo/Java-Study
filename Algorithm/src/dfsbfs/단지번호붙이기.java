package dfsbfs;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class 단지번호붙이기 {
  static int[][] graph = new int[26][26];
  static int n;
  static int h = 0;


  public static void main(String[] args) throws IOException {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));


    n = Integer.parseInt(r.readLine());
    for (int i = 0; i < n; i++) {
      char[] c = r.readLine().toCharArray();
      for (int j = 0; j < n; j++) {
        graph[i][j] = c[j] - '0';
      }
    }
    ArrayList<Integer> homes = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (dfs(i, j)) {
          homes.add(h);
          h = 0;
        }
      }
    }


    Collections.sort(homes);
    w.write(homes.size() + "\n");
    int size = homes.size();
    for (int i = 0 ; i < size; i++) {
      w.write(homes.get(i) + "\n");
    }
    w.flush();
    w.close();
    r.close();

  }

  static boolean dfs(int x, int y) {
    if (x < 0 || x >= n || y < 0 || y >= n) {
      return false;
    }
    if (graph[x][y] == 1) {
      graph[x][y]++;
      h++;
      dfs(x + 1, y);
      dfs(x - 1, y);
      dfs(x, y - 1);
      dfs(x, y + 1);
      return true;
    }
    return false;
  }
}