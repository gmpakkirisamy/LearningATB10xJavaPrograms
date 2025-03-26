package Java_1_Basic_Concepts.ex_43_Feb_24_Excersice_String_Concepts;

public class Lab_250_Feb_26 {
    public static void main(String[] args) {
    //1) Why should we use StringBuilder instead of String for string manipulation?
        // String are immutable which mean everytime you edit, a new string objet will be created.
        // But in StringBuilder it is mutable for modification the string without creating new objects

    //2) What is the role of the StringPool in Java's memory management?
        //String pool is special area in java heap area where String literal are stored.

    //3) Why does StringBuffer have better performance than String for string modifications?
        // String are immutable which mean everytime you edit, a new string objet will be created.
        // But in StringBuffer it is mutable for modification the string without creating new objects. In case of multithreading
        //this will be very efficient.

    //4) How does append() work in StringBuffer and StringBuilder?
        //string.append("Pakkiri");

    //5) How does length() work in StringBuffer and StringBuilder?
        //string.length("Pakkiri");

    //6) Explain substring().
       // string.substring(15,21); - I will display the letter between the index of 15 and 21.
    }
}
