package CodingTest.BeakJun.Solved.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 접미사배열 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    String[] strArr = new String[str.length()];
    for(int i = 0;i<str.length();i++) {
      strArr[i] = str.substring(i);
    }
    Arrays.sort(strArr);
    for(int i =0;i<strArr.length;i++) {
      System.out.println(strArr[i]);
    }
  }
}