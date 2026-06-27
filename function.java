import java.util.Scanner;

public class function {
  public static void num (){
//Scanner sc = new Scanner(System.in);
Scanner sc = new Scanner(System.in);
System.out.print(" Enter num a here : ");

int a = sc.nextInt();
System.out.print( " Enter num b here : ");
int b = sc.nextInt();
int sum = a + b ;
System.out.print(" The total sum is : " + sum );
sc.close();
  }
  public static void main(String[] args) {
    num ();
    //System.out.println(+sum);
  }
  //System.out.println(+sum);

}
