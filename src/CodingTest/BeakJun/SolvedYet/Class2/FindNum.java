package CodingTest.BeakJun.SolvedYet.Class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindNum {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int a = Integer.parseInt(br.readLine());
    String astr = br.readLine();
    int b = Integer.parseInt(br.readLine());
    String bstr = br.readLine();
    String[] bstrArr = bstr.split(" ");
    for(int i = 0;i< bstrArr.length;i++) {
      if(astr.contains(bstrArr[i])) {
        bw.write(1+"\n");
      } else {
        bw.write(0+"\n");
      }
    }
bw.flush();

  }
}
