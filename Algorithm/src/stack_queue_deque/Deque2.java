package stack_queue_deque;
/*
1 X: 정수 X를 덱의 앞에 넣는다. (1 ≤ X ≤ 100,000)
2 X: 정수 X를 덱의 뒤에 넣는다. (1 ≤ X ≤ 100,000)
3: 덱에 정수가 있다면 맨 앞의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
4: 덱에 정수가 있다면 맨 뒤의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
5: 덱에 들어있는 정수의 개수를 출력한다.
6: 덱이 비어있으면 1, 아니면 0을 출력한다.
7: 덱에 정수가 있다면 맨 앞의 정수를 출력한다. 없다면 -1을 대신 출력한다.
8: 덱에 정수가 있다면 맨 뒤의 정수를 출력한다. 없다면 -1을 대신 출력한다.
 */
import java.io.*;
import java.util.*;

public class Deque2 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(r.readLine());
            int input = 0;
            int data = 0;
            if (st.countTokens() == 2) {
                input = Integer.parseInt(st.nextToken());
                data = Integer.parseInt(st.nextToken());

            }
            else
                input = Integer.parseInt(st.nextToken());

            switch (input){
                case 1:
                    deque.addFirst(data);
                    break;
                case 2:
                    deque.addLast(data);
                    break;
                case 3:
                    if(deque.isEmpty()){
                        w.write(-1 + "\n");
                        break;
                    }
                    w.write(deque.removeFirst() + "\n");
                    break;
                case 4:
                    if(deque.isEmpty()){
                        w.write(-1 + "\n");
                        break;
                    }
                    w.write(deque.removeLast() + "\n");
                    break;
                case 5:
                    w.write(deque.stream().count() + "\n");
                    break;
                case 6:
                    if (deque.isEmpty()) {
                        w.write(1 + "\n");
                        break;
                    }
                    w.write(0 + "\n");
                    break;
                case 7:
                    if (deque.isEmpty()) {
                        w.write(-1 + "\n");
                        break;
                    }
                    w.write(deque.getFirst() + "\n");
                    break;
                case 8:
                    if (deque.isEmpty()) {
                        w.write(-1 + "\n");
                        break;
                    }
                    w.write(deque.getLast() + "\n");
                    break;
            }

        }
        w.flush();
        w.close();
        r.close();
    }
}