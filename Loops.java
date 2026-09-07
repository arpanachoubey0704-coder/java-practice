import java.util.Scanner;
public class Loops{
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print(" Enter numbere here : ")
    int n = sc.nextInt();
    if (n<=0){
      System.out.println("Numbere is negative");
    }
    else{
      System.out.println("Number is negative");
    }
    sc.close();
  }
}