import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(" Enter numbere here : ");

    int n = sc.nextInt();
    if(n<0){
      System.out.println( "Invaild number");
    }
   else if (n>=18){
      System.out.println("eligible to vote");
    }
    else{
      System.out.println("Not eligible to vote");
    }
    sc.close();
  }
}