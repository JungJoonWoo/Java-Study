package stack_queue_deck;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

/*
1 X: 정수 X를 스택에 넣는다. (1 ≤ X ≤ 100,000)
2: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
3: 스택에 들어있는 정수의 개수를 출력한다.
4: 스택이 비어있으면 1, 아니면 0을 출력한다.
5: 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.
 */
public class Stack2 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(r.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(r.readLine());
            int countToken = st.countTokens();
            int input = Integer.parseInt(st.nextToken());
            int data = 0;
            if(countToken == 2){
                data = Integer.parseInt(st.nextToken());
            }
            switch (input) {
                case 1:
                    stack.push(data);
                    break;
                case 2:
                    if(stack.empty()){
                        w.write(-1 + "\n");
                    }
                    else
                        w.write(stack.pop() + "\n");
                    break;

                case 3:
                    w.write(stack.stream().count() + "\n");
                    break;

                case 4:
                    if(stack.empty()){
                        w.write(1 + "\n");
                    }
                    else
                        w.write(0 + "\n");
                    break;

                case 5:
                    if(stack.empty()){
                        w.write(-1 + "\n");
                    }
                    else
                        w.write(stack.peek() + "\n");

                    break;

            }


        }
        w.flush();
        w.close();
        r.close();

    }
}