import java.util.Scanner;

public class Loops {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print( " Enter first num : ");
    
    int n= sc.nextInt();

    int sum = 0;
    int i = 1;

    while (i<=n) {
      sum = sum +i;
      i++;
    }
    System.out.println(+n +sum);
    sc.close();
  }
}