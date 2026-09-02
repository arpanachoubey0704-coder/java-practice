import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(" Enter any letter here : ");
    char letter = sc.next().charAt(0);
    if(letter=='a'||letter== 'e'|| letter=='i' || letter =='o' || letter =='u'){
System.out.println("Vowel");
    }
    else{
      System.out.println("Consonent");
    }
    sc.close();
  }
}