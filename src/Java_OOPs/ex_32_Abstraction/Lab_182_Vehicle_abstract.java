package Java_OOPs.ex_32_Abstraction;

public class Lab_182_Vehicle_abstract {
    public static void main(String[] args) {

    }
}

abstract class Vehicle {   // Class also to be abstract
    abstract void speed(); // Method also to be abstract
//     {                                  // If it is the abstract method,then it should not have body, which means that it can be override by its child
                                          // Strictly if they used by their childs.
//        System.out.println("25KM/H");
//    }

    void brand () {              // You can create non abstract method also
        System.out.println("Any Brand");
    }

}

class Bike extends Vehicle {  // Since this class extend the vehicle class, so now its forcefully to use the speed() method.


    @Override
    void speed() {
        System.out.println("10 KM/Hr");
    }
}

class car extends  Vehicle {  // Since this class extend the vehicle class, so now its forcefully to use the speed() method.

    @Override
    void speed() {
        System.out.println("25 KM/Hr");
    }
}
