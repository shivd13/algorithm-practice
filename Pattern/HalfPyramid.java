public class HalfPyramid {
  public static void main(String[] args) {
    int n = 4;
    // int count = 1;
    for(int i=1; i<=n; i++) {
      for(int j=1; j<=i; j++) {
        System.out.print(j + " ");
        // count++;
      }
      System.out.println();
    }
  }
}
