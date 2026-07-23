import java.util.Scanner;

public class Main {

    public static void greet (){
System.out.println("hellow welcome to java");
return;
    }
    public static void addnumber(int num1 , int num2){
        
        int sum= num1+num2;
System.out.print(" Sum is : " +sum);
    }
    public static void main(String[] args) {
        //addnumber(num1, num2);
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();
        addnumber(a, b);
        sc.close();
    }
}