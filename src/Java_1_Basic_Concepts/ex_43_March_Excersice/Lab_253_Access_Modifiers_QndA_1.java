package Java_1_Basic_Concepts.ex_43_March_Excersice;

public class Lab_253_Access_Modifiers_QndA_1 {
    public static void main(String[] args) {

        //1) What are the four types of access modifiers in Java? and what are their scopes?

        //ACCESS_MODIFIERS:
        //PUBLIC-This member is accessible from any other class
        //PROTECTED - This member is accessible only in the folder and their subclasses
        //PRIVATE- This member is accessible only in the same class and not accessible by any other class.
        //DEFAULT  - If no access modifier is specified, then the member is accessible only within its
                    //own package.

        //2) Can we override a private method?
        //No we cannot override the private method because, private member is only accessed
        //inside the class

        //3) What is the difference between default and protected access modifiers?
        //PROTECTED - Accessible within the same package and by subclasses (even if they are in different packages).
        //DEFAULT - Package-private (accessible only within the same package).

        //4) Can a subclass access a private member of its superclass?
        //No, a subclass cannot directly access private members (fields or methods) of its superclass.
        // Private members are only accessible within the class they are declared in.

        //5) What is the default access modifier in Java, and where is it applicable?
        //In Java, the default access modifier is package-private (also known as default).
        // This means that if you don't explicitly specify an access modifier for a class, method, or variable,
        // it will be accessible only within the same package.


    }
}
