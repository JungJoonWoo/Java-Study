package set_and_map;
/*
10
6 3 2 10 10 10 -10 -10 7 3 -> -10 -10 2 3 3 6 7 10 10 10

-10 2
2   1
3   2
6   1
7   1
10  3

8
10 9 -5 2 3 4 5 -10
1. map에 입력 받기(입력 받을때 키가 있으면 value + 1, 없으면 1 -> O(n)
2. key 값 정렬
3. 이진 탐색 -> nlogn
4. key와 겹치면 value 값 출력

*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class NumberCard2 {
    static List<Integer> list;
    public static void main(String[] args) throws Exception{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Integer, Integer> map = new HashMap<>();

        int n = Integer.parseInt(r.readLine());
        StringTokenizer st = new StringTokenizer(r.readLine());

        for (int i = 0; i < n; i++) {

            int num = Integer.parseInt(st.nextToken());

            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else
                map.put(num, 1);

        }
        list = new ArrayList<>(map.keySet());
        Collections.sort(list);

        int m = Integer.parseInt(r.readLine());
        st = new StringTokenizer(r.readLine());
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());

            if(binarySearch(num, 0, list.size() - 1)){
                w.write(map.get(num) + " ");
            }
            else
                w.write("0 ");
        }
        w.flush();
        w.close();
        r.close();

    }
    public static boolean binarySearch(int key, int start, int end){

        if (start <= end) {
            int mid = (start + end) / 2;
            if (list.get(mid) == key) {
                return true;
            } else if (list.get(mid) > key) {
                return binarySearch(key, start, mid - 1);
            }else if(list.get(mid) < key){
                return binarySearch(key, mid + 1, end);
            }

        }

        return false;
    }
}