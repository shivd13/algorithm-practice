public class HollowRectangle {
  public static void hollowRectangle(int toRow, int toCol) {
    for(int i=1; i<=toRow; i++){
      //inner loop
      for(int j=1; j<=toCol; j++){
        //cell - (i,j)
        if(i==1 || i==toRow || j==1 || j==toCol) {
          //Boundary cell
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  } 
  public static void main(String[] args) {
    hollowRectangle(5,3);
  }
}
