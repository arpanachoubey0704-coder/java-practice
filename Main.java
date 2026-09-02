import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n/5<=5){
System.out.println("number is Divisibilty by 5");
    }
    else{
      System.out.println("number is not divisibly by 5");
    }
  }
}