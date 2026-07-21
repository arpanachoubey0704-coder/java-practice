import java.util.Scanner;

public class Loops {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number here : ");
int a = sc.nextInt();
 System.out.print("Enter b number here : ");
int b = sc.nextInt();
 System.out.print("Enter c number here : ");
int c = sc.nextInt();
if(a>=b && a>=c){
  System.out.println(a);
}
else if (b>=a && b>=c) {
  System.out.println(b);
}
else{
  System.out.println(c);
}
sc.close();
  }
}