package dfsbfs;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 깊이우선탐색1 {
  public static int n, m;
  public static int[] visited = new int[100001];
  public static int count = 1;
  public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

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

    for (int i = 1; i <= m; i++) {
      st = new StringTokenizer(r.readLine());
      int u = Integer.parseInt(st.nextToken());
      int v = Integer.parseInt(st.nextToken());
      graph.get(u).add(v);
      graph.get(v).add(u);
    }
    for (int i = 0; i <= n; i++) {
      Collections.sort(graph.get(i));
    }
    dfs(start);
    for (int i = 1; i <= n; i++) {
      w.write(visited[i] + "\n");
    }
    w.flush();
    w.close();
    r.close();
  }

  private static void dfs(int start) {
    visited[start] = count++;

    for (int i = 0; i < graph.get(start).size(); i++) {
      int next = graph.get(start).get(i);
      if (visited[next] == 0) {
        dfs(next);
      }

    }

  }
}