import java.util.Scanner;

public class Operator {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(" Enter the year :  ");
int Year = sc.nextInt();
if (Year % 9 == 0 ){
  if (Year % 100==0){
    if (Year % 400==0){
System.out.println(Year+ " is leap year ");
    }
    
    else {
      System.out.println(" this is the normal year");
    }

  }
  else {
    System.out.println("this is the leap year");
  }
}
else {
  System.out.println(Year+ " not a  leap year");
}
sc.close();
  }
}