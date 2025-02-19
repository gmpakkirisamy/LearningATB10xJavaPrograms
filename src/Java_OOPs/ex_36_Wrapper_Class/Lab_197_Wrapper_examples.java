package Java_OOPs.ex_36_Wrapper_Class;

public class Lab_197_Wrapper_examples {
    public static void main(String[] args) {
        int a =10;
        Integer b = a; // This is called boxing - int -> Integer JVM will do it automatically

        System.out.println(b.intValue());
        System.out.println(Integer.MIN_VALUE);

        Integer a2 = 42;
        int v =a2; // This is called Unboxing
        // System.out.println(v.);  - Unboxing will not call any method.
    }
}
