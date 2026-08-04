//Palindrome number 

import java.util.Scanner;

public class variableanddatatype {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
System.out.print(" Enter num here : ");
    int num = sc.nextInt();
    int firstdigit = num/100;
    int lastdigit = num%10;
    if(firstdigit==lastdigit){
      System.out.println("num is palindrome");
    }
    else{
      System.out.println("num is not plaindrome");
    }
  }
}