import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
  static int result = 0;
  static int n, m;
  static int[] visited = new int[100_001];

  public static void main(String[] args) throws IOException {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(r.readLine());

    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    if (n == m) {
      w.write(0 + "");
    } else {
      bfs();
      w.write(result + "");
    }
    w.flush();
    w.close();
    r.close();

  }

  static void bfs() {
    Queue<Integer> q = new LinkedList<>();
    visited[n] = 1;

    q.offer(n);

    while (result == 0) {
      int size = q.size();

      for (int i = 0; i < size; i++) {
        int next = q.poll();
        if (next == m) {
          result = visited[next] - 1;
          return;
        }
        int[] t = {next - 1, next + 1, next * 2};
        for (int i1 : t) {
          if (i1 >= 0 && i1 <= 100_000 && visited[i1] == 0) {
            q.offer(i1);
            visited[i1] = visited[next] + 1;
          }
        }
      }

    }

  }
}