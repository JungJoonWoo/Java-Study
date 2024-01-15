package set_and_map;
/*
1. map 하나 생성
2. 처음엔 모두 add 하고 두 번째 입력을 받을 땐 같은 key가 없을때만 받기
3. map의 size 출력
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class CrossSubset {
    public static void main(String[] args) throws Exception{

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(r.readLine());

        Map<Integer, Integer> map = new HashMap<>();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(r.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            map.put(num, 1);
        }
        st = new StringTokenizer(r.readLine());
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(map.containsKey(num)){
                map.remove(num);
            }else{
                map.put(num, 1);
            }

        }
        w.write(map.size() + "\n");
        w.flush();
        w.close();
        r.close();

    }
}