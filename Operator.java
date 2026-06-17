import java.util.Scanner;

public class Operator {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(" Enter the day number : ");
    int weeknumber = sc.nextInt();
    switch (weeknumber) {
      case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
        case 3:
        System.out.println("wEDday");
        break;
        case 4:
        System.out.println("Thruday");
        break;
        case 5:
        System.out.println("Friday");
        break;
        case 6:
        System.out.println("Saturay");
        break;
case 7:
        System.out.println("Sunday");
        break;
      default:
        System.out.println("Please eneter the number 1 to 7");
        break;
    }
    sc.close();
  }
}