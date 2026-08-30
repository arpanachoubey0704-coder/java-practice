import java.util.Scanner;

public class Operator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(" Enter your first name : ");
    String firstname = sc.next();
    System.out.print(" Enter your last name : ");
    String Lastname = sc.next();
    System.out.print( " your full name is : ");
    String fullname = firstname + " " + Lastname;
    System.out.print(fullname);
  }
}
