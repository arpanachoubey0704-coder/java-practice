import java.util.Scanner;

public class Loops {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(" Enter num A here : ");
    int a = sc.nextInt(); 

    System.out.print(" Enter num B here : ");
    int b = sc.nextInt();
     
    if(a>b){
      System.out.print(+a + "is greater then B");
    }
    else{
      System.out.print( +a+ " is less then B");
      sc.close();
    }
  }
}