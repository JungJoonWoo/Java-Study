package stack_queue_deck;

import java.io.*;
import java.util.Iterator;
import java.util.Stack;

public class Zero {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());
        Stack<Integer> s = new Stack<>();
        int total = 0;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(r.readLine());
            if (a == 0) {
                s.pop();
            } else {
                s.push(a);
            }
        }
        for (Integer integer : s) {
            total += integer;
        }
        w.write(total + " ");
        w.close();
        r.close();
    }
}