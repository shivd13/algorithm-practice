public class Diamond {
  public static void main(String[] args) {
    int n=4;

    //1st Half 
    for(int i=1; i<=n; i++){

      //spaces
      for(int j=1; j<=(n-i); j++){
        System.out.print(" ");
      }

      //star
      for(int j=1; j<=(2*i)-1; j++){
        System.out.print("*");
      }
      System.out.println();
    }

    //2nd Half
    for(int i=n; i>=1; i--) {
      
      //spaces
      for(int j=1; j<=(n-i); j++){
        System.out.print(" ");
      }

      //star
      for(int j=1; j<=(2*i)-1; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
