package Java_2_OOPs_Concepts.ex_43_Mar_6_Excersice;

public class Lab_254_Access_Modifiers_QndA_2 {
    public static void main(String[] args) {

        //1) Why is the private access modifier used in encapsulation?
        // The private access modifier is used in encapsulation to restrict direct access to certain class members
        // (variables and methods) from outside the class. This is essential for data hiding and controlled access,
        // ensuring that an object's internal state is protected from unintended modifications.

        //2) Write a program to demonstrate the use of public, private, protected, and default access modifiers.
        //Please refer lab program number.

        //3) Can we make a constructor private? If yes, in what situations would we do that?
        //Yes, private constructors are used to create immutable classes, ensuring that instances cannot be modified after creation.

        //4)  If you don’t specify public, private, or protected for a method or variable, what happens?
        //If you don't specify public, private, or protected for a method or variable in Java, it gets the default
        // (package-private) access level. This means the method or variable is accessible only within the same package.

        //5) What happens when you use final with public, private or protected ?
        // Behaviour of public, private or protected will be same but the value assigned will be only once.
        //Final Methods: A public final method can be accessed from anywhere but cannot be overridden by subclasses.
        //Final Classes: A public final class can be accessed from anywhere but cannot be subclassed


    }
}
