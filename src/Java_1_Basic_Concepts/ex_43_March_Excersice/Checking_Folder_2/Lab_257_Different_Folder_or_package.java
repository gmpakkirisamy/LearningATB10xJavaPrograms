package Java_1_Basic_Concepts.ex_43_March_Excersice.Checking_Folder_2;

import Java_1_Basic_Concepts.ex_43_March_Excersice.Checking_Folder_1.Lab_255_Private_Public_Protected_Default;
import Java_1_Basic_Concepts.ex_43_March_Excersice.Checking_Folder_1.Lab_256_Accessing_Private_Public_Protected_Default;

public class Lab_257_Different_Folder_or_package {
}

class checking3 extends Lab_255_Private_Public_Protected_Default {
    public static void main(String[] args) {
        Lab_255_Private_Public_Protected_Default summa = new Lab_256_Accessing_Private_Public_Protected_Default();
        summa.display3(); // This is the public method which can be accessed by anywhere in the package.
        // summa.display1(); // This is the protected class which can be accessed with in the folder using the different class
                          //but not in the different package.

        // summa.display4(); // Accessible only within the same package. This means that classes, methods, or variables
                             // with no explicit access modifier (which means nothing will be mentioned as private/protected/public)
                             // can be accessed by any other class in the same package, but not by classes in different packages.

        //check2.display(); - This is the private which we cannot access outside of its class.
    }
}
