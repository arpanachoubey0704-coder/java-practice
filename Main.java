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
        Student s1 = new Student("Arpana");
        Student s2 = new Student("Palak");

        s1.display();
        s2.display();
    }
}
