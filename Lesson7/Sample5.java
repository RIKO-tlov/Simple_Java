class Sample5 {
  public static void main(string[] args) {
    int[] test1;
    test1 = new test[3];

    System.out.println("test1を宣言しました。");
    System.out.println("配列要素を確保しました。");

    test1[0] = 80;
    test1[1] = 60;
    test1[2] = 22;
    
    int[] test2;
    System.out.println("test2を宣言しました。");

    test2 = test1;
    System.out.println("test2をtest1に代入しました。");
    
}