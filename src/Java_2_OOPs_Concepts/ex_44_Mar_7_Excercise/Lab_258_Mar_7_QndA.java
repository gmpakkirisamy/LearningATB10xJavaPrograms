package Java_2_OOPs_Concepts.ex_44_Mar_7_Excercise;

public class Lab_258_Mar_7_QndA {
    public static void main(String[] args) {
        // 1. When overriding a method in a subclass, can we make it more or less accessible (e.g., change protected to public)?
              // When overriding a method in a subclass, we can make as more accessible but making a less accessible is not
              // possible.This means you can change the access modifiers to a more permissive one, but not to a more restrictive one.
                    //This is possible
                         // protected to public
                         // default (package-private) to protected or public
                         // private methods cannot be overridden, so this rule does not apply to them.

                    // This is not possible

                        //public cannot be changed to protected, default, or private
                        //protected cannot be changed to default or private
                        //default cannot be changed to private

        //See: Lab_258_Override_Less_More_Access

        //2) If a method is private in a parent class, can a child class use or inherit it?

                //No, a child class cannot use or inherit a private method from its parent class. Private methods
                // are only accessible within the class they are defined in and are not visible to subclasses or any other classes.

        //See: Lab_260_Child_Inherit_Private

        //3) What’s the difference between protected and private when a class inherits from another class?

            // private method is not accessible by the child class when it inherits from the parent class.
            // protected method is accessible by the child class when it inherits from the parent class.

        //4) If a subclass is in a different package, can it access a protected variable or method from its parent class?

            //Yes, if a subclass is in a different package, it can access a protected variable or method from its parent class.
            // The protected access modifier allows access within the same package and also in subclasses,
            // even if they are in different packages.

        //5) Can we use public, private, or protected with a variable declared inside a method?

            //No, you cannot use public, private, or protected access modifiers with a variable declared inside a method.
            // Variables declared inside a method are called local variables, and their scope is limited to the method in
            // which they are declared. Local variables do not have access modifiers because their visibility is inherently restricted to the method itself.

        //6)  How do public, private, and protected work when used with i
            //When using public, private, and protected with inner classes in Java, these access modifiers control
            // the visibility and accessibility of the inner class from other classes and packages

        //7) Can we declare an abstract method as private?

            //No, you cannot declare an abstract method as private in Java. Abstract methods are meant to
            // be overridden by subclasses, and making them private would prevent subclasses from accessing and overriding them.


    }
}
