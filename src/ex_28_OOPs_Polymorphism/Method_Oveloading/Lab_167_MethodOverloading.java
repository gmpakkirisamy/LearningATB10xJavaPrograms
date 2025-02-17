package ex_28_OOPs_Polymorphism.Method_Oveloading;

public class Lab_167_MethodOverloading {
    public static void main(String[] args) {

        Addition_operation a = new Addition_operation();

        System.out.println(a.add(3, 4)); //First method is called because only two parameter value is passed during compile time.

        System.out.println(a.add(5,6,7)); //Second method is called because only three parameter value is passed during compile time.

        System.out.println(a.add(5.6,7.8)); //Third method is called because of parameter value decimal is passed during compile time.


    }
}
