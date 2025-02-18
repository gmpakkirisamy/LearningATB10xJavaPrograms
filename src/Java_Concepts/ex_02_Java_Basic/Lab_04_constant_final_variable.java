package Java_Concepts.ex_02_Java_Basic;

public class Lab_04_constant_final_variable {
    public static void main(String[] args) {
        final int d = 10;
       // d= d+10; // since we marked d is final so we cannot change the d value here. For that is throwing an error.
        System.out.println(d);
    }
}
