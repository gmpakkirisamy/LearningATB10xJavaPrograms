package Java_1_Basic_Concepts.ex_43_Feb_24_Excersice_String_Concepts;

public class Lab_251_Feb_27 {
    public static void main(String[] args) {
    //1) Can multiple threads access the same String-buffer object at the same time?
        //Yes, StringBuffer is mutable in nature. And also it will not create the new object for every edit/modify of the string.

    //2) How does synchronize affect performance in String-buffer?
        // They are thread safe but executing the thread one by one cause the performance issue.

    //3) Can we make String-builder thread-safe?
        //Yes, String builder can thread safe manually

    //4) What happens if two threads try to modify the same String-builder object?
        //String builder is not a thread safe so if it is tries to modify on same time it will create inconsistency

    //5) Why is String preferred in multi-threading scenarios despite being immutable?
        //String is immutable  and thread safe  so it can perform string in multiple sceanrio

    }
}
