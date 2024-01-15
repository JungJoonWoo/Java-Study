package set_and_map;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StringSet {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        //String arr[] = new String[n];
        List<String> arr = new ArrayList<>();
        for(int i = 0; i<n; i++){
            arr.add(r.readLine());
        }
        int count = 0;
        for(int i = 0; i<m; i++) {
            String a = r.readLine();
            if(arr.contains(a))
                count++;
        }
        w.write(count + " ");
        w.flush();
        w.close();
        r.close();
    }
}