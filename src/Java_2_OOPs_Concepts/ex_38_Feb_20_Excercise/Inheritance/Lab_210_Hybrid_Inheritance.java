package Java_2_OOPs_Concepts.ex_38_Feb_20_Excercise.Inheritance;

public class Lab_210_Hybrid_Inheritance {
    public static void main(String[] args) {
        //Hybrid inheritance in Java is a combination of two or more types of inheritance.
        // However, Java does not support multiple inheritance directly due to the "diamond problem."
        // Instead, hybrid inheritance can be achieved using interfaces.
        // This is the combination of single , multi level, multiple level and hierarchical inheritance.

        dog dog1 = new dog();
        dog1.eat();
        dog1.walk();

        cat cat1 = new cat();
        cat1.eat();
        cat1.walk();
        cat1.sleep();
    }
}

interface animal {
    void eat();
}

interface mamal {
    void walk();
}

class dog implements animal, mamal {    // This is multiple inheritance
    @Override
    public void eat() {
        System.out.println("This dog can eat");
    }

    @Override
    public void walk() {
        System.out.println("This dog can walk");
    }
}

class cat extends dog {  // This is single inheritance
    void sleep() {
        System.out.println("This cat can sleep");
    }
}
