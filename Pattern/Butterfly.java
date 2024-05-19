public class Butterfly {
  public static void main(String[] args) {
    int n = 4;

    //1st Half
    for (int i = 1; i <= n; i++) {
      //stars - i
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      //spaces - 2*(n-i)
      for (int j = 0; j < 2*(n - i); j++) {
        System.out.print(" ");
      }

      //star - i
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
      
    }

    //2nd Half
    for (int i = n; i >= 1; i--) {
       //stars - i
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      //spaces - 2*(n-i)
      for (int j = 0; j < 2*(n - i); j++) {
        System.out.print(" ");
      }

      //star - i
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      System.out.println();
    }
  }
}
