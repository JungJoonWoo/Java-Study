package set_and_map;
/*
1. 카드 입력 받기
2. 카드 정렬 -> nlogn
3. 찾을 카드 입력 받기
4. 이진 탐색
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class NumberCard {
    public static void main(String[] args) throws Exception{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());

        int[] arr = new int[n];
        StringTokenizer a = new StringTokenizer(r.readLine());

        for(int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(a.nextToken());

        }
        Arrays.sort(arr);



        int m = Integer.parseInt(r.readLine());

        a = new StringTokenizer(r.readLine());

        for(int i = 0; i<m; i++){
            int num = Integer.parseInt(a.nextToken());
            if(checkValue(num, 0, n-1, arr) == 1){
                w.write("1 ");
            }
            else{
                w.write("0 ");

            }
        }
        w.flush();
    }

    private static int checkValue(int key, int start, int end, int[] arr) {
        if(start<=end) {
            int mid = (start + end) / 2;
            if (key == arr[mid]) {
                return 1;
            } else if (key < arr[mid]) {
                return checkValue(key, start, mid - 1, arr);
            } else {
                return checkValue(key, mid + 1, end, arr);
            }
        }
        return -1;
    }
}