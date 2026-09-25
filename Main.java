import java.util.Scanner;


public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" Enter numbere here : ");

    int n = sc.nextInt();
    if (n>0){
      System.out.println("NO. is Poitive");
    }
    else if (n==0) {
      System.out.println("No. is Zero");
    }
    else{
      System.out.println("No. is Negative");
    }
    sc.close();
  }
}