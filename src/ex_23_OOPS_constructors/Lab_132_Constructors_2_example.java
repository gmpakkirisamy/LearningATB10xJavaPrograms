package ex_23_OOPS_constructors;

public class Lab_132_Constructors_2_example {
    public static void main(String[] args) {

        A a1 = new A();
        A a2 = new A();

        System.out.println(a1);
        System.out.println(a2);
    }
}

class A {
    A() {
        System.out.println("Am the default constructor called!");
    }
    {
        System.out.println("Am IIB, Default will be called");
    }
}