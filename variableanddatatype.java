import java.util.Scanner;

public class variableanddatatype{
 public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  System.out.print(" Enter number here : ");
  int a = sc.nextInt();
  
  if(a%2==0){
System.out.println("No. is even");
  }
  else{
    System.out.println(" No. is odd");
    sc.close();
  }
 }
}