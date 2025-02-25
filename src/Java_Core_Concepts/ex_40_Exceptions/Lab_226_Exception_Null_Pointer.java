package Java_Core_Concepts.ex_40_Exceptions;

public class Lab_226_Exception_Null_Pointer {
    public static void main(String[] args) {
        System.out.println("Start!");
        String s1 = null;
        try {
            s1.trim(); //String value is null so this function will not work during run time and give the null pointer exception.
        } catch (Exception e) {
        //} catch (Throwable e) {    - Also you can call the parent class
            System.out.println(e.getMessage());
        }
        System.out.println("End!");
    }
}
