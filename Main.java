import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     char a = sc.next().charAt(0);
     boolean t = sc.nextBoolean();
     double d = sc.nextDouble();

     System.out.println(" Hellow  : " +n + " " +a + " " +t+ " "+d);
     sc.close();
  }
}