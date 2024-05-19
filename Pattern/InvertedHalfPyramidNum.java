public class InvertedHalfPyramidNum {
  public static void main(String[] args) {
    int n = 5;
    System.out.println();
    //Outer Loop
    for(int i=1; i<=n; i++){
      //Number
      for(int j=1; j<=n-i+1; j++){
        System.out.print(j +" ");
      }
      System.out.println();
    }
  }
}
