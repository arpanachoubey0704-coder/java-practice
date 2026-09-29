// Input three side lengths and determine whether they can form a triangle and, if so, whether the triangle is equilateral, isosceles, or scalene.

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if(a+b >c && b+c>a && c+a>b){
      if(a==b&&b==c){
        System.out.println("equilateral");
      }
      else if( a==b || b==c|| c==a){
System.out.println("isosceles");
      }
      else{
        System.out.println("scalene");
      }
    }
    else{
      System.out.println("not form a triangle");
    }
    sc.close();
  }
}