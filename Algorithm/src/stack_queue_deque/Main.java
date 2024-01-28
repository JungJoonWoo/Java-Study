package stack_queue_deque;
/*
확인해야하는 곳: 현재 줄 서 있는 곳의 가장 앞, 스택의 마지막
두 개를 확인해 만약 차례가 맞다면 꺼내거나 팝, 아니라면 스택에 푸시
first: 간식을 받을 수 있는 숫자
last: 스택에 들어갈 수 있는 숫자
5 2 1 4 3 -> 5 2 -> 5 4 -> nice
5 1 3 2 4 -> nice
6 4 5 2 1 3
 */
import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[n];
        int first = 1;
        int index = 0;
        StringTokenizer st = new StringTokenizer(r.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        boolean isNice = true;
        while(index < n){

            if (arr[index] == first) {
                first++;
            } else if (!stack.empty() && stack.peek() == first) {
                stack.pop();
                first++;
                index--;

            } else {
                stack.push(arr[index]);
            }
            index++;

        }
        while (!stack.isEmpty()){
            if (stack.peek() != first) {
                isNice = false;
                break;
            }
            stack.pop();
            first++;
        }
        if (isNice) {
            w.write("Nice");
        }
        else {
            w.write("Sad");
        }
        w.flush();
        w.close();
        r.close();
    }
}