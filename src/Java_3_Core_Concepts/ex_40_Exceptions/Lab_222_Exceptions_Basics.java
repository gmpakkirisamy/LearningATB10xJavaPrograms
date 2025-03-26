package Java_3_Core_Concepts.ex_40_Exceptions;

public class Lab_222_Exceptions_Basics {

    // EXCEPTIONS
    // An Exception is an event that occurs during the execution of a program that disrupts the normal flow of the instructions
    // If no exception is handled then control will be passed to the JVM and JVM will terminate the program.
    // Error Vs Exceptions (They are very different)
    // This to be handled wisely.
    // Error - You cannot handle. (Stack Error/Memory Error/Etc)
    //Exceptions - You can handle-try catch, try catch finally, throw, throws....

    //TWO TYPES
    //1. Checked - JVM knows it during the compile time
    // Refer : Lab_223_Exception_Unchecked
    //2. Unchecked - JVM does not know it , this will come to know at the run time.
    //Refer : Lab_224_Exception_Checked

    //HOW TO HANDLE
    //1. Try and Catch
    //2. Throws

    // Also to learn
        //Try and Catch
        //Try and Multiple Catch
        //Throw vs Throw
        //Custom Exceptions

    //Program Execution in case of Exception

    // In Execution, MT(Main Thread will be responsible for calling the main function)
    //If any issues main program communicate with the main thread and main thread communicate with the JVM.
    // Then JVM will terminate the program
}
