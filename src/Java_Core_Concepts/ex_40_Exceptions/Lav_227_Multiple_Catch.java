package Java_Core_Concepts.ex_40_Exceptions;

public class Lav_227_Multiple_Catch {
    public static void main(String[] args) {
        // If you are sure about the exception what you will get. Then you can specific to the exception handling by using the multiple catch.
        //This is not good way. A tester should be specific the exception if you are not sure about the exception then use only "Exception"
        int a = 0;
        int b=0;

        try {
            int c = 10/a;
        } catch (ArithmeticException e) { // This is child of Exception
            System.out.println(e.getMessage());
        }
        catch (Exception e) { // This is child of Throwable
            System.out.println(e.getMessage());
        }
        catch (Throwable e) {
            System.out.println(e.getMessage());
        }

    }
}
