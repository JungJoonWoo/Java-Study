package stack_queue_deque;
/*
q s s q
1 2 3 4

2 2 3 1 -> 4

4 2 3 2 -> 1

7 2 3 4 -> 2
 */
import java.io.*;
import java.util.*;

public class StackQueue {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(r.readLine());

        StringTokenizer st = new StringTokenizer(r.readLine());

        int[] type = new int[n];
        int count = 0;
        //type 확인
        int stackCount = 0;
        for (int i = 0; i < n; i++){
            if (Integer.parseInt(st.nextToken()) == 0) {
                //큐의 인덱스 확인 -> type = 1 2
                type[count++] = i;
                //1, 2번 입력만 배열에 넣음
            } else {
                stackCount++;
            }
        }
        //int[] deque = new int[count];
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        st = new StringTokenizer(r.readLine());
        //값 삽입
        int count1 = 0;
        for (int i = 0; i < n; i++) {
            if (stackCount == n) {
                break;
            }
            if (type[count1] == i) {
                deque.add(Integer.parseInt(st.nextToken()));
                count1++;
            } else {
                st.nextToken();
            }
        }

        int m = Integer.parseInt(r.readLine());
        st = new StringTokenizer(r.readLine());
        r.close();

        for (int i = 0; i < m; i++) {
            if(stackCount == n){
                w.write(st.nextToken() + " ");
            }
            else {

                deque.addFirst(Integer.parseInt(st.nextToken()));
                w.write(deque.pollLast() + " ");
            }
        }
        w.flush();
        w.close();
    }
}