import java.util.Scanner;

public class variableanddatatype {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print(" Enter no. A here : ");
  int A = sc.nextInt();
    System.out.print(" Enter no. B here : ");
  int B = sc.nextInt();
    System.out.print(" Enter no. C here : ");
  int C = sc.nextInt();
  int Average = (A+B+C)/3 ;
  System.out.print(" Average of all number is : " +  Average);
  sc.close();
}
}