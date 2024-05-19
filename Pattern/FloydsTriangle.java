public class FloydsTriangle {
  public static void main(String[] args) {
    int n =5;
    int count =1;
    System.out.println();
    //Outer Loop
    for(int i=1; i<=n; i++){
      //Inner Loop
      for(int j=1; j<=i; j++){
        System.out.print(count + " ");
        count ++;
      }
      System.out.println();
    }
  }
}
