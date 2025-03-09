package Java_3_Core_Concepts.ex_40_Exceptions;

public class Lab_228_Multiple_Exception {
    public static void main(String[] args) {
        //Here we have two types of exception. Arithmetic and NullPointer
        int a = 0;
        int b = 10;
        try {

            //int c = b / a;
            String s1 = null;
            s1.trim();
        } catch (ArithmeticException | NullPointerException e) { // You can also handle the exception using the or method.
            System.out.println(e.getMessage());

        }
        System.out.println(b);
    }
}
