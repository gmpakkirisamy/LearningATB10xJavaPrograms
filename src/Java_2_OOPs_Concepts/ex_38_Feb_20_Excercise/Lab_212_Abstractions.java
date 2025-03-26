package Java_2_OOPs_Concepts.ex_38_Feb_20_Excercise;

public class Lab_212_Abstractions {
    public static void main(String[] args) {
    // Abstract classes are used to define a common base class that other classes can inherit from.
        // They can contain both abstract methods (without implementation) and concrete methods (with implementation).
    // This abstract class can have the concrete method (method with body) and abstract methods (methods without body)
    dmart dmart1 = new dmart();
    dmart1.carrot();
    dmart1.onion();

    reliance reliance1 = new reliance();
    reliance1.carrot();
    reliance1.onion();

    }
}

abstract class vegetables {
    abstract void carrot();
    // Under the abstract class there should be a abstract method should be there.
    // And abstract method should not have the body.
    void onion() {
        System.out.println("Onion Accessed!");
    }
}

class dmart extends vegetables {

    @Override
    void carrot() {
        System.out.println("Am overridden carrot!");
    }
}

class reliance extends vegetables {
    @Override
    void carrot() {
        System.out.println("Am overridden carrot!");
    }
}