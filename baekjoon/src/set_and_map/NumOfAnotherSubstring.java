package set_and_map;
/*
1. 추출한 값을 set에 넣으면 중복 자동 걸러짐 -> set 원소 갯수 출력
a -> a ->  1
ab - > a, b ,ab -> 3 -> 2 + 1, 3 + 0
abc -> a, b, c, ab, bc, abc -> 6 5 + 1
abcd -> a, b, c, d, ab, bc, cd, abc, bcd, abcd -> 10
abcde -> a, b, c, d, e, ab, bc, cd, de, abc, bcd, cde, abcd, bcde, abcde -> 15
1 2 3 4 5
1 3 6 10 15
2. length i = 1 ~ length 반복문
3. index 0을 시작으로 i 길이만큼 set에 넣기
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class NumOfAnotherSubstring {
    public static void main(String[] args) throws Exception{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = r.readLine();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            for(int j = i + 1; j<=s.length(); j++){
                set.add(s.substring(i, j));
            }
        }
        w.write(set.size() + " ");
        w.flush();
        w.close();
        r.close();
    }
}