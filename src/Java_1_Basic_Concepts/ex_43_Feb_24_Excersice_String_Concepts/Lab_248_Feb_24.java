package Java_1_Basic_Concepts.ex_43_Feb_24_Excersice_String_Concepts;

public class Lab_248_Feb_24 {
    public static void main(String[] args) {
        //1) Why are String immutable in Java ?
            //Strings are immutable in java because once they created in SCP (String Constant Pool) then this cannot be changed.

        //2) What is the difference between String, StringBuffer, and StringBuilder?
            //String - They are immutable in nature, once they created in java they cannot be changed.
            //StringBuffer - They are mutable in nature. It is thread safe because its methods are synchronized. This means
                        //multiple thread can access and modify the string-buffer objet without causing any data corruption
            //StringBuilder - They are also mutable in nature. But it's not thread safe because these methods are not synchronized.
                        //This means that single thread only can access this, and it has the safety concerns.

        //3) What is a memory pool in Java?
            //Memory pool refers in java, that separate memory location is managed by the Java Virtual Machine(JVM) where objects
            // are allocated and tracked.

        //4) Why is StringBuffer synchronized while StringBuilder is not?
            //Stringbuffer is synchronized because, this is thread safe and multiple thread can access and modify the object created
            //without causing any data corruption.
            //Stringbuilder is not synchromized because, this is not thread safe make it faster than stringbuffer but should not
            //be used in the mutlithread environment

        //5) How can we convert a StringBuffer to String?
            //We can convert a StringBuffer to a String using the toString() method.


        //How can we convert a StringBuffer to String - Example

        //Creating string buffer objected
        StringBuffer sb = new StringBuffer("Pakkirisamy");
        System.out.println(sb);

        //Converting string buffer to string
        String string = sb.toString();

        System.out.println(string);

    }
}
