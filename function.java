import java.util.Scanner;

public class function {
    public static int calculateProduct(int x, int y) {
        int product = x * y;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int result = calculateProduct(a, b);
        System.out.println("Product is : " + result);
    }
}