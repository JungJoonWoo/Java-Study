package dfsbfs;

import java.io.*;
import java.util.*;

public class Dfs와Bfs {
  static int n, m;
  static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
  static int visited[] = new int[1001];
  static int count = 1;
  static int answer[] = new int[1001];

  public static void main(String[] args) throws IOException {
    BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(r.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    int start = Integer.parseInt(st.nextToken());

    for (int i = 0; i <= n; i++) {
      graph.add(new ArrayList<>());
    }

    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(r.readLine());
      int u = Integer.parseInt(st.nextToken());
      int v = Integer.parseInt(st.nextToken());
      graph.get(u).add(v);
      graph.get(v).add(u);
    }

    for (int i = 1; i <= n; i++) {
      Collections.sort(graph.get(i));
    }

    dfs(start);

    int index = start;

    for (int i = 1; i <= count - 1; i++) {
      w.write(answer[i] + " ");
    }
    w.write("\n");
    visited = new int[1001];
    count = 1;
    answer = new int[1001];
    bfs(start);
    for (int i = 1; i <= count - 1; i++) {
      w.write(answer[i] + " ");
    }
    w.flush();
    w.close();
    r.close();

  }

  private static void bfs(int start) {
    Queue<Integer> q = new LinkedList<>();
    visited[start] = 1;
    answer[count++] = start;
    for (int i = 0; i < graph.get(start).size(); i++) {
      q.offer(graph.get(start).get(i));
    }
    while (!q.isEmpty()) {
      int next = q.poll();
      if (visited[next] != 0) {
        continue;
      }
      if (visited[next] == 0) {
        visited[next] = 1;
        answer[count++] = next;
      }
      for (int i = 0; i < graph.get(next).size(); i++) {
        q.offer(graph.get(next).get(i));
      }
    }

  }

  private static void dfs(int start) {
    visited[start] = 1;
    answer[count++] = start;
    for (int i = 0; i < graph.get(start).size(); i++) {
      int next = graph.get(start).get(i);
      if (visited[next] == 0) {
        dfs(next);
      }
    }
  }

}