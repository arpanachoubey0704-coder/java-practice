// positive and even, positive and odd, negative and even, or negative and odd.

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n>0 && n%2==0){
      System.out.println("positive and even");
    }
    else if (n>0&&n%2!=0){
      System.out.println("positive and odd");
    }
    else if (n<0 && n%2==0){
      System.out.println("negative and even");
    }
    else
    {
      System.out.println("negative and odd");
    }
    sc.close();
  }
}