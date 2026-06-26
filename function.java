public class function {
    public static void calculateSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("sum is : " + sum);
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculateSum(a, b);
    }
}