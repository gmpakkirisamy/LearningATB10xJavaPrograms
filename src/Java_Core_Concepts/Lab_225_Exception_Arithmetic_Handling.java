package Java_Core_Concepts;

public class Lab_225_Exception_Arithmetic_Handling {
    public static void main(String[] args) {

        System.out.println("1");
        // It will give the exception.
        //Select the below and click on surround
        try {
            int a = 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage()); //This will give the message
            System.out.println("Are you fool to divide by zero ?");
            System.out.println(e.getStackTrace()); // It will print the trace
            e.printStackTrace(); // This will give the full problem in details with line no
        }
        //After handling this rest of the code will be executed.
        System.out.println("2");

    }
}
