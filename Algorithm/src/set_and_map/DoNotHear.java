package set_and_map;
/*

 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class DoNotHear {
    public static void main(String[] args) throws Exception{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(r.readLine());
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String s = r.readLine();
            if(set.contains(s)){
                list.add(s);
            }
        }
        Collections.sort(list);
        w.write(list.size() + "\n");
        for (String s : list) {
            w.write(s + "\n");
        }
        w.flush();
        w.close();
        r.close();
    }
}