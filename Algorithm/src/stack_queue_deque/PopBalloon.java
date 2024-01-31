package stack_queue_deque;
/*
양수면 오른쪽으로, 음수면 왼쪽으로 회전
1 2 3 4 5
3 2 1 -3 -1

2 3 4 5
5
4 5 2
5 2
2

1 -3 -1 2

 */
import java.io.*;
import java.util.*;

public class PopBalloon {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayDeque<int[]> deque = new ArrayDeque<>();
        int n = Integer.parseInt(r.readLine());
        StringTokenizer st = new StringTokenizer(r.readLine());
        for (int i = 0; i < n; i++) {
            deque.add(new int[]{i + 1, Integer.parseInt(st.nextToken())});
        }
        while (!deque.isEmpty()) {
            w.write(deque.getFirst()[0]+ " ");
            int[] next = deque.poll();
            if (deque.isEmpty()) {
                break;
            }
            if (next[1] > 0) {
                for (int i = 0; i < next[1] - 1; i++) {
                    deque.addLast(deque.pollFirst());
                }
            } else {
                for (int i = next[1]; i < 0; i++) {
                    deque.addFirst(deque.pollLast());

                }
            }
        }
        w.flush();
        w.close();
        r.close();

    }

}