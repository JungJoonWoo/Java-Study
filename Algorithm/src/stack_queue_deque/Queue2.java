package stack_queue_deque;
/*
push X: 정수 X를 큐에 넣는 연산이다.
pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 큐에 들어있는 정수의 개수를 출력한다.
empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 */
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Queue2 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(r.readLine());
            String f = st.nextToken();
            switch (f) {
                case "push":
                    queue.offer(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    try {
                        int head = queue.poll();
                        w.write(head + "\n");
                    } catch (Exception e) {
                        w.write(-1 + "\n");
                    }finally {
                        break;
                    }
                case "size":
                    w.write(queue.size() + "\n");
                    break;
                case "empty":
                    if (queue.isEmpty()){
                        w.write(1 + "\n");
                        break;
                    }
                    w.write(0 + "\n");
                    break;
                case "front":
                    if (queue.isEmpty()) {
                        w.write(-1 + "\n");
                    }
                    else
                        w.write(queue.peek() + "\n");
                    break;
                case "back":
                    if (queue.isEmpty()) {
                        w.write(-1 + "\n");
                    }
                    else
                        w.write(((LinkedList<Integer>) queue).peekLast() + "\n");
                    break;
            }
        }
        w.flush();
        w.close();
        r.close();
    }
}