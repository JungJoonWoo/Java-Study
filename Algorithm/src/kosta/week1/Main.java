package kosta.week1;

import java.io.*;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    LinkedList<Integer> mainList = new LinkedList<>();
    int[] dropList = new int[2];
    int sum = 0;
    for (int i = 0; i < 9; i++) {
      int input = Integer.parseInt(r.readLine());
      if (i < 2) {
        dropList[i] = input;
      } else {
        mainList.add(input);
        sum += input;
      }
    }
//    mainList.sort((o1, o2) -> o1-o2);
    while (sum != 100) {
      int dropNum = dropList[0];
      dropList[0] = dropList[1];

      int mainNum = mainList.removeLast();
      sum -= mainNum;
      sum += dropNum;
      mainList.addFirst(dropNum);
      dropList[1] = mainNum;

    }

    Collections.sort(mainList);

    for (int i = 0; i < 7; i++) {
      w.write(mainList.removeFirst() + "\n");
    }
    w.flush();
    w.close();
    r.close();
  }
}