package Java_3_Core_Concepts.ex_40_Exceptions;

public class Lab_234_finally_notrun_thisCase {
    public static void main(String[] args) {
        try {
            int a = 10/10;
          //  System.exit(0); - can only stop the execution of the finally block.
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Hello Last");
        }
    }
}
