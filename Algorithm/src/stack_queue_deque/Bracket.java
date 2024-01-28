package stack_queue_deque;

import java.io.*;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());

        for (int i = 0; i < n; i++) {
            String s = r.readLine();
            Stack<Character> stack = new Stack<>();
            for (int j = 0; j < s.length(); j++) {
                char t = s.charAt(j);
                if(j == 0){
                    if (t == ')') {
                        stack.push(t);
                        break;
                    }
                    stack.push(t);
                } else if (t == '(') {
                    stack.push(t);
                }
                else if(t == ')'){
                    if (stack.empty()) {
                        stack.push(t);
                        break;
                    }
                    stack.pop();
                }
            }
            if(stack.empty())
                w.write("YES\n");
            else
                w.write("NO\n");

        }
        w.flush();
        w.close();
        r.close();
    }
}