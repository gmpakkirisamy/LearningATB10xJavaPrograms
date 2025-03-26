package Java_2_OOPs_Concepts.ex_37_Feb_19_Excersice;

public class Lab_200_default_constructor {
    public static void main(String[] args) {
    //Q: What is a default constructor? Give one example, Write a code for that.
        //Default constructor is invoked automatically when the object is created.
        //Constructor name should be same as class name
        // And it should not have any access modifiers.
        human h1 = new human();

    }
}

class human {
    int age;

    human() {
        System.out.println("Am the default constructor called automatically");
    }
}