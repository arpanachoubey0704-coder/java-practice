import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(" Enter no. here : ");
int n = sc.nextInt(); 
 
    if (n%3==0 && n%5==0){
 System.out.println("divisible by both 3 and 5");
    }
else if(n%3==0 || n%5==0){
  System.out.println("divisible by either 3 or 5");
}
    else{
      System.out.println("not divisible");
    }
    sc.close();
  }
}