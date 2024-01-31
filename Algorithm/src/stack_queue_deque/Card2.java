package stack_queue_deque;
/*
카드 1 2 3 4 5 -> 3 4 5 2 -> 5 2 4 -> 4 2 -> 2
1. 카드 갯수 1 break
2. pop, pop->offer 반복
3. 마지막 카드 출력
 */
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;


public class Card2 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        for (int i = 0; i < n - 1; i++) {
            queue.poll();
            int a = queue.poll();
            queue.offer(a);
        }
        w.write(queue.poll() + "\n");
        w.flush();
        w.close();
        r.close();
    }
}