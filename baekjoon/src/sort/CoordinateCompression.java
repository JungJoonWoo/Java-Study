package sort;
/*
1. 입력 받아서 배열
2. treeset(정렬, 중복방지), list 에 입력
3. 정렬된 list에서 이진탐색을 통해 일치하는 숫자의 인덱스 출력 -> nlogn

 */
import java.io.*;
import java.util.*;

public class CoordinateCompression {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(r.readLine());
        StringTokenizer st;
        st = new StringTokenizer(r.readLine());
        Set<Integer> sortSet = new TreeSet<>();
        List<Integer> rawList = new ArrayList<>();
        for(int i = 0; i<a; i++){
            int n = Integer.parseInt(st.nextToken());
            sortSet.add(n);
            rawList.add(n);
        }
        Object[] arr = new Object[sortSet.size()];
        arr = sortSet.toArray();

        for(int i= 0; i<a; i++){
            w.write(Arrays.binarySearch(arr, rawList.get(i)) + " ");
        }
        w.flush();
        w.close();
        r.close();

    }
}