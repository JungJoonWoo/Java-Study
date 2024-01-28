package sort;
/*
 Arrays.sort()에서 정렬 알고리즘에 의해 위치를 바꾸고, 0 이나 음의 정수인 경우는 두 객체의 위치는 바뀌지 않는다.
 */
import java.io.*;
import java.util.*;

public class WordSort {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(r.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = r.readLine();
        }
        arr = Arrays.stream(arr).distinct().toArray(String[]::new);
        Arrays.sort(arr, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                if(s1.length() == s2.length()){
                    return s1.compareTo(s2);
                }
                else
                    return s1.length() - s2.length();
            }
        });
        for (String s : arr) {
            w.write(s + "\n");

        }

        w.flush();
        w.close();
        r.close();
    }

}