package Java_4_W3School_Programs;

public class Lab_262_Type_casting {
    public static void main(String[] args) {
        //Widening Casting (automatically) - converting a smaller type to a larger type size
        //Narrowing Casting (manually) - converting a larger type to a smaller size type

        //Widening Casting
        int myInt = 9;
        double myDouble = myInt;
        System.out.println(myInt);
        System.out.println(myDouble);


        //Narrowing Casting
        double myDouble1 = 9.123d;
        int myInt1 = (int) myDouble1;
        System.out.println(myInt1);
    }
}
