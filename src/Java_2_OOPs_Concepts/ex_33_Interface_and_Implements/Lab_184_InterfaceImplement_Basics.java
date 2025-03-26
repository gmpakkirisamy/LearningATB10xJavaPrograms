package Java_2_OOPs_Concepts.ex_33_Interface_and_Implements;

public class Lab_184_InterfaceImplement_Basics {
    public static void main(String[] args) {
        bike b1 = new bike();
        b1.drive();
    }
}

//INTERFACES
//Interfaces provide complete abstraction, contains only method declaration without implementations.
// We cannot create concrete or complete method in it.
// We can create concrete or complete method in it using default method only.
//Implements can be used only in case of interfaces.
// We can do multiple inheritance using the implements and Interface.

//ABSTRACT VS INTERFACE
//Abstract can have both incomplete and concrete method. But interface only have incomplete method.
//Keyword - abstract and interface
// Abstract can have constructors whereas interfaces cannot have constructors.
// Abstract can use any access modifiers (public, protected, private) but interface can have only public

class bike implements engine, breaks {   // This is multiple inheritance

    void drive() {
        startEngine();
        applyBreak();
        stopEngine();
    }

    @Override
    public void applyBreak() {
        System.out.println("Apply Break");
    }

    @Override
    public void startEngine() {
        System.out.println("Start Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop Engine");
    }
}

interface engine {    //Interfaces provide complete abstraction, contains only method declaration without implementations.
    void startEngine();
    void stopEngine();

//    void cleanCar() {                                     // We cannot create concrete or complete method in the Interfaces.
//        System.out.println("I will clean the car!");
//    }

    default void testDrive(){                             // We can create concrete or complete method in it using only default method.
        System.out.println("I will do the test drive!");
    }
}

interface breaks {    //Interfaces provide complete abstraction, contains only method declaration without implementations.
    void applyBreak();
}