package Java_OOPs.ex_34_Static_Keyword;

public class Lab_189_Static_SIB {
    public static void main(String[] args) {
        a A = new a();
    }
}

class a {
    static { // Static Initialization Block
        System.out.println("Am Static Block Called only once when class is loaded");
    }
    static  int a= 10; // Static variable

    static void cool(){ // Static Method
        System.out.println("Am Static Method");
    }
//    static class B {
//        //This is static inner class and no where useful in the automation.
//    }
}


