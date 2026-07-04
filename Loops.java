import java.util.Scanner;

public class Loops {
  public static void main(String[] args) {
    System.out.print( " Enter the Latter : ");
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    int ASCII = (int) ch;
    System.out.print(" The ASCII value of  " +ch + "  is : " + ASCII);
    sc.close();
  }
}