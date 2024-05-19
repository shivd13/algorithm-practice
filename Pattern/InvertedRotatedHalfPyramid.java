public class InvertedRotatedHalfPyramid {
  public static void main(String[] args) {
    int n = 4;
    //Outer loop
    for(int i=1; i<=n; i++) {
      //spaces
      for(int j=0; j<(n-i); j++) { 
        System.out.print(" ");
      }
      //Star
      for(int j=1; j<=i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
