import java.util.Scanner;

public class function {

  public static int calculatesum () {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
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