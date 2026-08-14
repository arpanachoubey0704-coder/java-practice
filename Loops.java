public class Loops {
  public static void main(String[] args) {
    System.out.print(" Even number : ");
    for (int n=2; n <=10; n+=2){
      System.out.print( n + " ");
    }
    System.out.println();
     System.out.print(" ODD number : ");
    for (int n=1; n <=10; n++){
      System.out.println("numbers are : ");
      if(n%4 !=0){
      System.out.print( n + " ");
      }
    }
  }
}