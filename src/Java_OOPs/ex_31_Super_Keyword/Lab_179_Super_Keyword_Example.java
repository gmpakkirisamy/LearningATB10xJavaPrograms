package Java_OOPs.ex_31_Super_Keyword;

public class Lab_179_Super_Keyword_Example {
    public static void main(String[] args) {
        car c1 = new car(100);
        c1.display();
    }
}
// Single Inheritance
class vehicle {
    int maxSpeed = 180;

    vehicle() {
        System.out.println("Am the DC");
    }

    vehicle(int a) {
        System.out.println("Am the Parameterized Constructor!");
    }

    void message() {
        System.out.println("No Argument and No Return Type!");
    }

    //This below method is called Method Overloading where Same Method name but different arguments are passed
    void message(int a) {
        System.out.println("With Argument and No Return Type! Speed is " + a);
    }

    void display () {
        System.out.println("Vehicle - Parent!");
    }

    void parenttest(){
        System.out.println("This is parent function!");
    }
}

// This is the car function which acquire the function of vehicle
class car extends vehicle {
    private int maxSpeed = 200;

    //Calling the parent constructor by using the constructor only using the keyword super.

    car() {  // This is the default constructor. From here only you can call the parent constructor using super keyword.
        super(50); // This will call the parent constructor which is the parameterized one.
    }

    car(int a) { //This is the Parameterized Constructor (PC) of Car Method
        System.out.println("This is the PC of Car Method!");
    }

   void test(){
        System.out.println("This is simple Method!");
    }

    @Override
    void display() {  // This method is overrides parent display() method.
        System.out.println("This is my override car function!");
        System.out.println(super.maxSpeed); // This will call the parent variable
        System.out.println(this.maxSpeed); // This will call the child variable.
        this.test(); // You can call the child method using this keyword.
        super.parenttest(); // You can call the parent method using the super keyword
    }
}


