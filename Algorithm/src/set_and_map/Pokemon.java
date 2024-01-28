package set_and_map;
/*
1. 입력받아서 숟자에 맞게 map에 넣기
2. 입력이 숫자인지 문자인지 판단
3. 숫자면 단어, 문자면 숫자 출력
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Pokemon{
    public static void main(String[] args) throws Exception{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<Integer, String> map = new HashMap<>();
        Map<String, Integer> map1 = new HashMap<>();

        StringTokenizer st = new StringTokenizer(r.readLine());
        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());

        for(int i = 1; i<=first;i++){
            String s = r.readLine();
            map.put(i, s);
            map1.put(s, i);
        }
        for(int i = 0; i<second; i++){
            String s = r.readLine();
            try{
                int a = Integer.parseInt(s);
                w.write(map.get(a) + "\n");
            }catch(Exception e){
                w.write(map1.get(s) + "\n");
            }
        }

        w.flush();
        w.close();
        r.close();
    }
    public static <K, V> K getKey(Map<K,V> map, V value){
        for (K k : map.keySet()) {
            if(map.get(k).equals(value)){
                return k;
            }
        }
        return null;
    }
}