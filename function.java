import java.util.Scanner;

public class function {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  System.out.print(" Enter length here : ");
  double length = sc.nextDouble();
  System.out.print(" Enter breadth here : ");
  double breadth = sc.nextDouble();
  System.out.println("Area is  : " + length * breadth);
  System.out.println( " Perimeter is : " + 2*(length+breadth));
sc.close();
  }
}
 