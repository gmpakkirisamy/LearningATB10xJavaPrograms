package Java_2_OOPs_Concepts.ex_27_OOPs_Inheritance.ex_02_Multiple_Inheritance_Using_Interface;

public class Lab_204_Multiple_Inheritance {
    // Multiple inheritance is not possible in java
    // Which means Son cannot extend from father as well as mother at time
    // THis is called diamond problem in java.
    // Java is not allowed this inheritance.
    // This can be solved using the interface and implements
    public static void main(String[] args) {
    child ch1 = new child();
    ch1.money();
}
}

class child implements father, mother {
    @Override
    public void money() {   //Though mother and father have money method and only one method will be called. Also, this method
        System.out.println("This is child money only not father/mother");// has to declare themselves they will not get anything from father and mother.

    }

    @Override
    public void fat1() {

    }

    @Override
    public void mot1() {

    }
}


interface father {
    void money();
    void fat1();
}

interface mother {
    void money();
    void mot1();
}
