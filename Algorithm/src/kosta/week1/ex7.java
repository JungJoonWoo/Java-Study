package kosta.week1;

import java.io.*;
import java.util.StringTokenizer;

public class ex7 {
  public static void main(String[] args) throws IOException {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(r.readLine());

    StringTokenizer st = new StringTokenizer(r.readLine(), "*");

    String[] charArray = {st.nextToken(), st.nextToken()};

    for (int i = 0; i < n; i++) {
      String input = r.readLine();

      if (input.length() < charArray[0].length() + charArray[1].length()){
        w.write("NE\n");
        continue;
      }
      String first = input.substring(0, charArray[0].length());
      String last = input.substring(input.length() - charArray[1].length());


      if (first.equals(charArray[0]) && last.equals(charArray[1])) {
        w.write("DA\n");
      } else {
        w.write("NE\n");
      }

    }
    w.flush();
    w.close();
    r.close();



  }
}