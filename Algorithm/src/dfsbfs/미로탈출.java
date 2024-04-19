package dfsbfs;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 미로탈출 {
  //  public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
  public static int[][] graph = new int[201][201];
  static int n, m;

  public static void main(String[] args) throws IOException {
    BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(r.readLine());

    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    for (int i = 0; i < n; i++) {
      char[] c = r.readLine().toCharArray();
      for (int j = 0; j < m; j++) {
        graph[i][j] = c[j] - '0';
      }
    }

    System.out.println(bfs(0, 0));

  }

  public static int bfs(int x, int y) {
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};
    Queue<Node> q = new LinkedList<>();
    q.offer(new Node(x, y));

     while (!q.isEmpty()) {
      Node node = q.poll();
      x = node.getX();
      y = node.getY();
      for (int i = 0; i < 4; i++) {
        int nx = x + dx[i];
        int ny = y + dy[i];
        if (nx < 0 || nx > n - 1 || ny < 0 || ny > m - 1) {
          continue;
        }
        if (graph[nx][ny] == 0) {
          continue;
        }
        if (graph[nx][ny] == 1) {
          graph[nx][ny] = graph[x][y] + 1;
          q.offer(new Node(nx, ny));
//          graph[x][y] = 0;
        }
      }
    }
    return graph[n - 1][m - 1];
  }

  static class Node {
    public int x;
    public int y;

    public Node(int x, int y) {
      this.x = x;
      this.y = y;
    }

    public int getX() {
      return x;
    }

    public int getY() {
      return y;
    }
  }
}