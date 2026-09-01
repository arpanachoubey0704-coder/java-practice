import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(" Enter Student marks : ");
    int marks = sc.nextInt();
    if(marks>=40){
      System.out.print("Pass");
    }
    else{
      System.out.println("Fail");
    }
    sc.close();
  }
}