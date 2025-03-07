package Java_3_Core_Concepts.ex_40_Exceptions;

public class Lab_229_try_catch_finally {
    public static void main(String[] args) {
        int a = 1;
        int b = 10;
        try {
            int c = b/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally { // Finally will be executed always. if we get exceptions or not.
            System.out.println("Either case i will be executed always. That's the work for me!");
        }
        System.out.println(a);

    }
}
