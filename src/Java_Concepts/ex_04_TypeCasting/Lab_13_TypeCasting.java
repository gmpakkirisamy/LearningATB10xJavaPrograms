package Java_Concepts.ex_04_TypeCasting;

public class Lab_13_TypeCasting {
    public static void main(String[] args) {

        //Widening
        byte b = 10;
       // int a= b;   // Valid case --> Implicit widening - Store the byte value into integer
        int a= (int)b;   // Valid case --> Explicit widening

        //Narrowing

        int d = 200;
        // byte e = d; //Invalid for implicit casting narrowing is not possible
        byte e = (byte)d; // Valid -> Explicit casting - Allowed but loss of data will be there.


    }
}
