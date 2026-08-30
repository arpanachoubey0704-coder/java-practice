// // import java.util.Scanner;

// // public class Operator {
// //   public static void main(String[] args) {
// //     Scanner sc = new Scanner(System.in);
// //     System.out.print(" Enter your first name : ");
// //     String firstname = sc.next();
// //     System.out.print(" Enter your last name : ");
// //     String Lastname = sc.next();
// //     System.out.print( " your full name is : ");
// //     String fullname = firstname + " " + Lastname;
// //     System.out.print(fullname);
// //   }
// // }
// import java.util.Scanner;

// public class Operator {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print(" Enter your first name : ");
//     String firstname = sc.next();
//     System.out.print(" Enter your last name : ");
//     String Lastname = sc.next();
//     System.out.print( " your full name is : ");
//     String fullname = firstname + " " + Lastname;
//     System.out.print(fullname);
//   }
// }
// Enter your name:
// Enter your age:
// Enter your CGPA:
// Enter your grade:
// // Enter are you a student:

import java.util.Scanner;

public class Operator {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(" Enter your name here : ");
    String name = sc.nextLine();
    System.out.println(name);
    System.out.print(" Enter your age here : ");
    int age = sc.nextInt();
    System.out.println(age);

    System.out.print(" Enter your CGPA here : ");
    double cgpa = sc.nextDouble();
    System.out.println(cgpa);

    System.out.print(" Enter your grade here : ");
char grade = sc.next().charAt(0);
System.out.println(grade);

    System.out.print(" Enter you are student : ");
    boolean student = true;
System.out.println(student);
    sc.close();
  }
}