public class Loops {
  public static void main(String[] args) {
    int a = 8;
    int b = 9;
    //int temp = a ;
    a = a ^ b ;
    b  = a ^ b ;
    a = a ^ b ;
  
    System.out.println(" a : " +a);
    System.out.println(" b : " +b);
  }
}