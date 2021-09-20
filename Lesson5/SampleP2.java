/*5-1
①a >= 0 && a < 10
②!(a = 0)
③a >= 10 || a == 0
*/

//5-2
import java.io.*;

class SampleP2 {
  public static void main(String[] args) throws IOException {
    System.out.println("整数を入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    int res = Integer.parseInt(str);

    if((res % 2) == 0) {
      System.out.println(res + "は偶数です。");
    } else {
      System.out.println(res + "は奇数です。");
    }
  }
}