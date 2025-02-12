package ex_24_OOPS_constructors;

public class Lab_131_Constructors {
    public static void main(String[] args) {

        baby b1 = new baby();
        b1.name = "Samy";

        new baby(); // Automatically this will be called
        new baby(); // Automatically this will be called


    }

}

class baby {
    String name;

    // This is default constructor
    baby() {
        System.out.println("Am called.........");
        //Constructors - It is the special method which is invoked automatically at the time of object creation
        //Once the object is created immediately. Name will be created after the object is creted.
        //This should not have any access modifier to be typed like void/private/public
        //Constructor name should be same as the method and should not have return type - THis is condition.
        //And this will be automatically called when the object is created.
        // IIB block also will be called when object initialization, we can use if it required otherwise its not needed.

        //Two Types:
        //Default Constructor
        //Parameterised Constructor

    }

    {  //IIB - Instance Initialization Block
        System.out.println("Am also called, when class is loaded Am IIB!");
    }
}
