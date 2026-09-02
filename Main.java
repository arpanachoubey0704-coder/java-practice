import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(" Enter any letter here : ");
    char letter = sc.next().charAt(0);
    if(letter>= 'A' && letter<= 'Z'){
System.out.println("Upper letter");
    }
    else{
      System.out.println("LOwer letter");
    }
    sc.close();
  }
}