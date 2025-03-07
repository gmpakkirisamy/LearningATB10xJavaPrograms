package Java_1_Basic_Concepts.ex_43_March_Excersice.Checking_Folder_1;

public class Lab_256_Accessing_Private_Public_Protected_Default extends Lab_255_Private_Public_Protected_Default{
    public static void main(String[] args) {
        Lab_256_Accessing_Private_Public_Protected_Default check2 = new Lab_256_Accessing_Private_Public_Protected_Default();
        check2.display1(); // This is the protected class which can be accessed with in the folder using the different class.
        check2.display3(); // This is the public method which can be accessed by anywhere in the package.
        check2.display4(); //
        //check2.display(); - This is the private which we cannot access outside of its class.
    }

}
