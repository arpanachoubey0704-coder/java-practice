class Student
{
    String name;          // Instance Variable
    static String college = "SISTec"; // Static Variable

    Student(String n)
    {
        name = n;
    }

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Student s2 = new Student("Arpana");
        Student s3 = new Student("Palak");

        s2.display();
        s3.display();
    }
}
