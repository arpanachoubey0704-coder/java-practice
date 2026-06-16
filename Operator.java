public class Operator {
  public static void main(String[] args) {
    int a = 2;
int b = 3;
int res = --a * b++ + ++b / a++;

System.out.println("a = " + a);
System.out.println("b = " + b);
System.out.println("Result = " + res);
  }
}
