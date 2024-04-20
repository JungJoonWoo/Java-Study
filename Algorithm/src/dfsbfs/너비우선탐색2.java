package dfsbfs;

import java.io.*;
import java.util.*;

public class 너비우선탐색2 {
  public static int n, m;
  public static int[] visited = new int[100001];
  public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
  public static int count = 1;
  public static void main(String[] args) throws IOException {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

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
      Collections.sort(graph.get(i), ((o1, o2) -> o2-o1));
    }

    bfs(start);

    for (int i = 1; i <= n; i++) {
      w.write(visited[i] + "\n");
    }
    w.flush();
    w.close();
    r.close();
  }

  public static void bfs(int start) {
    Queue<Integer> q = new LinkedList<>();
    visited[start] = count++;
    for (int i = 0; i < graph.get(start).size(); i++) {
      q.offer(graph.get(start).get(i));
    }
    while (!q.isEmpty()) {
      int n = q.poll();
      if (visited[n] != 0) {
        continue;
      }
      if (visited[n] == 0){
        visited[n] = count++;
      }
      for (int i = 0; i < graph.get(n).size(); i++) {
        q.offer(graph.get(n).get(i));
      }
    }
  }
}