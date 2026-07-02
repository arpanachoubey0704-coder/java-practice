import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(" Enter the num : ");
    int n = sc.nextInt();
    if ( n%2 !=00 ){
      System.out.println("weird");
    }else{
      if (n>=2&&n<=5){
    System.out.println("not werid");
    }
    else if (n>=6&&n<=20){
System.out.println("werid");
    }
    else{
      System.out.println("not weird");
    }
  }
    sc.close();
  }
}
