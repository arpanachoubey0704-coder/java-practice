import java.util.Scanner;

public class Operator{
  public static void main(String[] args) {
System.out.print(" Eneter your age : ");
    Scanner sc = new Scanner (System.in);
  int a = sc.nextInt();
  System.out.println(a);
System.out.print(" Eneter your grade : ");
  char c = sc.next().charAt(0);
System.out.println(c);
  sc.close();
  }
}