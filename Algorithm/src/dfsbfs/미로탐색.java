import org.w3c.dom.Node;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
  static int graph[][];
  static int n;
  static int m;
  static int[] dx = {-1, 1, 0, 0};
  static int[] dy = {0, 0, -1, 1};

  public static void main(String[] args) throws IOException {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(r.readLine());

    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    graph = new int[n + 1][m + 1];

    for (int i = 1; i <= n; i++) {
      char[] c = r.readLine().toCharArray();
      for (int j = 1; j <= m; j++) {
        graph[i][j] = c[j - 1] - '0';
      }
    }

    bfs(1, 1);
    w.write(graph[n][m] + "");
    w.flush();
    w.close();
    r.close();
  }

  static void bfs(int x, int y) {
    Queue<Node> q = new LinkedList<>();
    q.offer(new Node(x, y));

    while (!q.isEmpty()) {
      Node next = q.poll();
      for (int i = 0; i < 4; i++) {
        x = next.getX();
        y = next.getY();

        int nx = x + dx[i];
        int ny = y + dy[i];

        if (nx < 0 || ny < 0 || nx > n || ny > m) {
          continue;
        } else if (graph[nx][ny] == 1) {
          graph[nx][ny] += graph[x][y];
          q.offer(new Node(nx, ny));
        }
      }
    }
  }

  static class Node {
    int x, y;

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