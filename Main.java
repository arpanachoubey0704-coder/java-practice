import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(" Enter tempreture here : ");
int tempreture = sc.nextInt();
  
    if(tempreture<25){
 System.out.println("below freezing");
    }
else if (tempreture==25) {
  System.out.println("norma");
}

    else{
      System.out.println("above normal");
    }
    sc.close();
  }
}