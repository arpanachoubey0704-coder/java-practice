import java.util.Scanner;

public class Loops{
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print(" Enter no.here : ");
  int n = sc.nextInt();
  int num = 1;
  while (num<=n){
    System.out.println(num);
    num++;
  }
  System.out.println("congrts your number are here");
  sc.close();
}
}