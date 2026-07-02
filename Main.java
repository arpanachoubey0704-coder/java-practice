import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(" Enter the num : ");
    int n = sc.nextInt();
    if ( n%2 ==1 ){
      System.out.println("no is odd");
    }else{
    System.out.println("no is even");
    }
    sc.close();
  }
}
