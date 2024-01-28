package sort;
/*
1. 숫자를 10으로 나누고 나머지를 배열에 저장 -> n
2. 배열을 내림차순으로 정렬 -> nlogn
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.lang.Integer.parseInt;

public class SortInside {
    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<>();
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int n = parseInt(r.readLine());
        while (n > 0) {
            int num = n % 10;
            list.add(num);
            n /= 10;

        }
        list.sort(Comparator.reverseOrder());
        for (Integer i : list) {
            w.write(Integer.toString(i));
        }
        w.flush();
        w.close();
        r.close();
    }
}