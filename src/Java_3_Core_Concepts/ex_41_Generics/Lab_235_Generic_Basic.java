package Java_3_Core_Concepts.ex_41_Generics;

public class Lab_235_Generic_Basic {
    public static void main(String[] args) {

        temp(23,45);
        temp("Samy", "karthy");
        temp(true, false);

    }
// This is the generic method which can access multiple data type. This is just want to understand the concept.
    public static <T> T temp(T a, T b) {
        System.out.println(a);
        System.out.println(b);
        return null;
    }
    //
}
