import java.util.Scanner;

public class Loops{
  public static void main(String[] args) {
    System.out.print("enter num here : ");
    Scanner sc = new Scanner(System.in);
    int range = sc.nextInt();
    int counter = 1;
    while(counter<=range){
      System.out.print(counter  +" ");
      counter++;
      sc.close();
    }
  }
}