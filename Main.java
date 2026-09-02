import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(" Enter any latter here : ");
    char latter = sc.next().charAt(0);
    if(latter>= 'A' && latter<= 'Z'){
System.out.println("Upper latter");
    }
    else{
      System.out.println("LOwer latter");
    }
    sc.close();
  }
}