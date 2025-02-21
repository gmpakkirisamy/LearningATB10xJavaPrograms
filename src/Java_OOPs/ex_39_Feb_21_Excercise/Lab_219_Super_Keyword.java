package Java_OOPs.ex_39_Feb_21_Excercise;

import org.w3c.dom.ls.LSOutput;

public class Lab_219_Super_Keyword {
    public static void main(String[] args) {
        //Super keyword in java is a reference variable that allows access to the method, variables and constructor of parent class.
        //use of super with variables
        //use of super with methods
        //use of super with constructors

        //Another word - call the parent method/variable using the super keyword
        son ss1 = new son();
        ss1.home2();
        //ss1.home();
    }
}

class father {

    int age = 45;
    void home (){
        System.out.println("Am having the 1BHK house");
    }

    father() {
        System.out.println("Am the DC Constructor");
    }
}
class son extends father {

    void home2(){
        System.out.println("Am the Son Home Function");

        System.out.println(super.age);
        super.home();
    }

    son(){
        super(); // This is to call the parent constructor
    }


}
