package dfsbfs;

import java.io.*;
import java.util.StringTokenizer;

public class 음료수얼려먹기 {
  //  public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
  public static int[][] graph = new int[1001][1001];
  public static int visited[] = new int[10];
  public static int n;
  public static int m;

  public static void main(String[] args) throws IOException {
    BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(r.readLine());

    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    for (int i = 0; i < n; i++) {
      char[] input = r.readLine().toCharArray();
      for (int j = 0; j < m; j++) {
        graph[i][j] = input[j] - '0';
      }
    }
    int result = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (dfs(i, j)) {
          result += 1;
        }
      }
    }
    System.out.println(result);

  }

  public static boolean dfs(int x, int y) {
    if (x < 0 || x >= n || y < 0 || y >= m) {
      return false;
    }
    if (graph[x][y] == 0) {
      graph[x][y] = 1;
      dfs(x + 1, y);
      dfs(x + -1, y);
      dfs(x, y + 1);
      dfs(x, y - 1);
      return true;
    }
    return false;
  }

}