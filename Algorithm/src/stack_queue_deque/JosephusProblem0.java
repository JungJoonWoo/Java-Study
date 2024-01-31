package stack_queue_deque;
/*
1 2 3 4 5 6 7 -> 1 2 4 5 6 7 -> 1 2 4 5 7 -> 1 4 5 7 -> 1 4 5 -> 1 4 -> 4 -> X
3 % 7            5 % 6          7 % 5        4 % 4      3 % 3    5 % 2
3                6              2            7          5        1      4
큐 갯수 % 이전 수 인덱스 -1 + 3
1 2 3 4 -> 1 3 4 -> 1 3 -> 1
 */
import java.io.*;
import java.util.*;

public class JosephusProblem0 {
    public static void main(String[] args) throws IOException {
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        w.write("<");
        List<Integer> queue = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int index = 0;
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }


        while (queue.size() > 0) {
            int get = queue.get((index - 1 + k) % queue.size());
            if(n == queue.size()){
                index = queue.indexOf(get);
                queue.remove(index);
                w.write(Integer.toString(get));
            }
            else{
                w.write(", ");
                index = queue.indexOf(get);
                queue.remove(index);
                w.write(Integer.toString(get));
            }
        }
        w.write(">");
        w.flush();
        w.close();
        r.close();
    }
}