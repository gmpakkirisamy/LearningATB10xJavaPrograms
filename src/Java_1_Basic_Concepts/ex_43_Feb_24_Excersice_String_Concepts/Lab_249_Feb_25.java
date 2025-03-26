package Java_1_Basic_Concepts.ex_43_Feb_24_Excersice_String_Concepts;

public class Lab_249_Feb_25 {
    public static void main(String[] args) {

        //1) When would you use StringBuffer over StringBuilder?
            // In place where multiple thread is used to modify the same string for multiple time. Then that case you can use
            //StringBuffer over StringBuilder. Its methods are well synchronized and ensuring thread safety. When you need to ensure
            //That only one thread can modify a string, String€Buffer is the better choice.

        //2) How does the equals() method work for String objects?
            // equals() checks the character or content to match between the two string.

        //3) What is the difference between == and .equals() in Java?
            // equals() checks the character or content to match between the two string.
            // == - This will compare the location in case of string. And gives the results. If it in the SCP or heap area it will compare
            // and gives the result

        //4) Is StringBuffer thread-safe?
            //Yes, StringBuffer is thread-safe. Its methods are synchronized, which means that only one thread can access a method at a time.
            // This synchronization ensures that StringBuffer can be safely used in a multi-threaded environment without causing data corruption or inconsistencies.
            //However, this thread safety comes with a performance cost due to the overhead of synchronization. If you don't need thread safety,
            // it's generally better to use StringBuilder, which is faster because it doesn't have synchronized methods.

        //5) What happens when you combine two strings using the + operator in Java? For example, if you have two strings like "Hello" and "World",
        // what will happen if you write "Hello" + "World"?
            //This will concatenate two string and print as "HelloWorld"

    }
}
