import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(" Enter number here : ");
    int n = sc.nextInt();
    if(n%2==0){
System.out.println("number is Divisibilty by 2");
    }
    else{
      System.out.println("number is not divisibly by 2");
    }
    sc.close();
  }
}