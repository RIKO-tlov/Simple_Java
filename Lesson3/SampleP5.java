//3-5

import java.io.*;

class SampleP5 {
  public static void main(String[] args) throws IOException {
    System.out.println("身長と体重を入力して下さい。");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str1 = br.readLine();
    String str2 = br.readLine();

    double num1 = Double.parseDouble(str1);
    double num2 = Double.parseDouble(str2);

    System.out.println("身長は" + num1 + "センチです。");
    System.out.println("体重は" + num2 + "キロです。");
  }
}