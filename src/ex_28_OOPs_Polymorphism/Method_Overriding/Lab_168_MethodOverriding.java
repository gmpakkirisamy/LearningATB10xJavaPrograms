package ex_28_OOPs_Polymorphism.Method_Overriding;

public class Lab_168_MethodOverriding {
    public static void main(String[] args) {

        Son s1 = new Son(); // It will call the method from Sons class
        s1.home();

        Father f1 = new Father();  // It will call the method from Fathers class
        f1.home();

        // Son s2 = new Father(); - This is not possible because Father cannot born after the son. So it's not logical.

        Father f2 = new Son(); // This is dynamic dispatch

    }
}
