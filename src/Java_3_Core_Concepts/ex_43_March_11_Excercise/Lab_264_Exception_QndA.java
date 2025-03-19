package Java_3_Core_Concepts.ex_43_March_11_Excercise;

public class Lab_264_Exception_QndA {
//1. What is an exception in Java? How is it different from an error?
    // An Exception is an event that occurs during the execution of a program that disrupts the normal flow of the instructions
    // If no exception is handled then control will be passed to the JVM and JVM will terminate the program.
        // Error Vs Exceptions (They are very different)
        // This to be handled wisely.
        // Error - You cannot handle. (Stack Error/Memory Error/Etc)
        //Exceptions - You can handle-try catch, try catch finally, throw, throws....


//2. Explain the difference between Checked and Unchecked exceptions in Java.
    //1. Checked - JVM knows it during the compile time
    //2. Unchecked - JVM does not know it , this will come to know at the run time.

//3. What is the purpose of the try, catch, finally blocks?
    // If you are sure about the exception what you will get. Then you can specific to the exception using the try block
    //Then how to respond when the exception is happened is dealt with the catch block using the message
    //What ever the case finally block will be executed if exception is happened or not.

//4. Can we have multiple catch blocks in Java? If yes, in which order should they be arranged?
    //Yes we can have multiple catch blocks and its will ordered using the parent from child (Throwable > Exception >ArithmeticException)

//5. Explain the difference between throw and throws in Java.
    //throws  - will be used in main method. But it's not used in automation. Just to understand this. Not recommendable
    //throw - will be used inside the methods and classes to throw the specific errors.

//6. What happens if an exception is not handled in Java?
    // If no exception is handled then control will be passed to the JVM and JVM will terminate the program.

//7. Can we write code after the finally block? What happens if an exception occurs in finally?
    //Yes, you can write code after the finally block. The code after the finally block will execute regardless
    // of whether an exception was thrown or not.

//8. What are some common runtime exceptions you have encountered while working with Selenium? (optional Question Because that Selenium is not covered)
    //NoSuchElementException
    //TimeoutException
    //NoSuchWindowException

//9. Can we catch multiple exceptions in a single catch block? How?
//    Yes, you can catch multiple exceptions in a single catch block using the multi-catch feature introduced in Java 7.
//    This allows you to handle different exceptions in a single block, making your code cleaner and more concise. Here's an example:
//
//            try {
//        // Code that might throw multiple exceptions
//    } catch (IOException | SQLException e) {
//        // Handle both IOException and SQLException
//        System.out.println("An error occurred: " + e.getMessage());
//    }

//10. What is the significance of the Exception class and Throwable in Java?
    //Throwable is the superclass of all errors and exceptions in Java. It is part of the java.lang package.
    //Exception is a subclass of Throwable and is used for conditions that applications might want to catch.
}
