import java.util.Scanner;

public class Loops {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(" Enter num here : ");
    int num = sc.nextInt();
while (num <=100){
  System.out.println(+num);
  num++;

}
sc.close();
  }
}
