package set_and_map;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class PersonInCompany{
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());
        StringTokenizer st;
        //List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for(int i = 0; i< n; i++){
            st = new StringTokenizer(r.readLine());
            String name = st.nextToken();
            String condition = st.nextToken();
            if(condition.equals("enter")){
                set.add(name);
            }
            else if(condition.equals("leave")){
                set.remove(name);
            }
        }
        List<String> list = new ArrayList<>(set);
        Collections.sort(list);
        Collections.reverse(list);
        for(String s : list){
            w.write(s + "\n");
        }
        w.flush();
        w.close();
        r.close();
    }
}