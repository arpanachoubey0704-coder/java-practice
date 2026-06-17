import java.util.Scanner;

public class Operator {

  public static void main(String[] args) {
    System.out.print(" Enter your number : ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if (num >=0){
      System.out.print(" number is positive : " +num);
    }
    else if (num <=0){
      System.out.println(" number is negative : " +num);
    }
    else {
      System.out.println(" number is not poitive and not negative ");
    }
  }
}