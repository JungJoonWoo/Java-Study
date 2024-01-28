package stack_queue_deque;

import java.io.*;
import java.util.Stack;

public class BalancedWorld {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            String input = reader.readLine();
            if (input.equals(".")) break;

            Stack<Character> stack = new Stack<>();
            boolean isBalanced = true;

            for (char ch : input.toCharArray()) {
                switch (ch) {
                    case '[':
                    case '(':
                        stack.push(ch);
                        break;
                    case ']':
                        if (stack.isEmpty() || stack.pop() != '[') {
                            isBalanced = false;
                        }
                        break;
                    case ')':
                        if (stack.isEmpty() || stack.pop() != '(') {
                            isBalanced = false;
                        }
                        break;
                }

                if (!isBalanced) break;
            }

            if (isBalanced && stack.empty()) {
                writer.write("yes\n");
            } else {
                writer.write("no\n");
            }
        }

        writer.flush();
        writer.close();
        reader.close();
    }
}