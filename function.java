import java.util.Scanner;

public class function {

  public static int calculatesum () {
    Scanner sc = new Scanner(System.in);
    System.out.println( "Enter num a : ");
    int a = sc.nextInt();
    System.out.println( "Enter num b : ");
    int b = sc.nextInt();
int sum = a + b ;
sc.close();
return sum ;
// sc.close();
  }
  public static void main(String[] args) {
    int totalsum = calculatesum();
    System.out.println(totalsum);
    
  }
}
