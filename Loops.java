import java.util.Scanner;
public class Loops {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(" ENter the natural num : ");
    int n = sc.nextInt();
   int sum = 0;
    for(int i = 1 ; i<=n; i++){
    sum = sum + i ;
    }
    System.out.println(" Total sum of natural num : " +sum);
    sc.close();
  }
}