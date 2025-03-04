package Java_2_OOPs_Concepts.ex_34_Static_Keyword;

public class Lab_187_Static_Basics {
    public static void main(String[] args) {

        //STATIC KEYWORD
        //Non Access modifier that is used to indicate that a particular member(variable, method)
        //Static members are shared across all the instances
        //They may be a
        //Static Variable
        //Static Method
        //Static Block
        //Static Class (not useful)

        Student s1 = new Student(23);
        Student s2 = new Student(45);

        System.out.println(s1.age); // String ATB is the shared variable for both the student. Which means this is
        // common to all the references.
        System.out.println(s2.age);

        System.out.println(Student.course_name); // Without accessing the reference or object we can access the static value
        // They are already available in the class loaders not in the object

        Student.example();  // Without accessing the reference or object we can access the static method


    }
}

class Student {
    int age; // This is non static
    static String course_name = "ATB"; // This is the static variable. Where before variable/method static keyword is used.
    // This value is available in the class loader.

    public Student(int age_c) { // Parameterized constructor is created here
        this.age = age_c;


    }

    static void example() {

        System.out.println("Am Static Method");

    }


}