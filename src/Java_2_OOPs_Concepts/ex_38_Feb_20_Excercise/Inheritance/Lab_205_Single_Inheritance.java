package Java_2_OOPs_Concepts.ex_38_Feb_20_Excercise.Inheritance;

public class Lab_205_Single_Inheritance {
    public static void main(String[] args) {
        // Inheritance - It is nothing but one class(sub class) which inherits the properties (attributes and behaviour)
        // of another (super class) is called inheritance in java

        // Single Inheritance - This is nothing but one class extend the properties of another one class.

        B c = new B();
        c.Amethod();
        c.Bmethod();

    }
}

class A {

    void Amethod() {
        System.out.println("Am the method of A Class");
    }


}

class B extends A {
    void Bmethod() {
        System.out.println("Am the method of B Class");
    }

}
