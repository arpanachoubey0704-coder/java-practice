import java.util.Scanner;

public class function {
  public static void num (int a , int b ){
//Scanner sc = new Scanner(System.in);
// Scanner sc = new Scanner(System.in);
// System.out.print(" Enter num a here : ");

// int a = sc.nextInt();
// System.out.print( " Enter num b here : ");
// int b = sc.nextInt();
int sum = a + b ;
System.out.print(" The total sum is : " + sum );
//sc.close();
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(" Enter num a here : ");

int a = sc.nextInt();
System.out.print( " Enter num b here : ");
int b = sc.nextInt();
    num (a,b);
    //System.out.println(+sum);
    sc.close();
  }
  //System.out.println(+sum);

}
