package Java_2_OOPs_Concepts.ex_38_Feb_20_Excercise.Inheritance;

public class Lab_206_Multiple_Inheritance {
    public static void main(String[] args) {

        C1 d1 = new C1();
        d1.A1method();
        d1.B1method();
        d1.common();
    }
}
//Multiple Inheritance - This is the fundamental concept of java.
// Two super class which share the properties like attributes and behaviour to the one sub class
// To use this interface need to be used in class creation
// And methods inside the interface should be always empty or should not contain any codes
interface A1 {
    void A1method();
    void common();
}

interface B1 {
    void B1method();
    void common();

}
// Implements will be used to inherit the methods from two super class
// To add methods right click -> Generate -> Implement method -> Select all the method and click ok.
// If parent having the same two methods then only one method will be taken in the extend class. Here C1
class C1 implements A1, B1 {
    @Override
    public void common() {
        System.out.println("This is the common method for both A1 and B1");
    }

    @Override
    public void A1method() {
        System.out.println("This is the method of A1 present in C1 method using implements");
    }

    @Override
    public void B1method() {

        System.out.println("This is the method of B1 present in C1 method using implements");

    }
}
