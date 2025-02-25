package Java_OOPs.ex_31_Super_Keyword;

public class Lab_178_Super_Keyword_Basics {
    //Super keyword in java is a reference variable that allows access to the method, variables and constructor of parent class.
    //use of super with variables
    //use of super with methods
    //use of super with constructors

    //Another word - call the parent method/variable using the super keyword

    public static void main(String[] args) {
        son sc1 = new son();
        sc1.sonHome();
    }
}

class father2 {
    int gold = 1000;

    father2() {
        System.out.println("Am DC of Father");
    }

    void home() {
        System.out.println("I have 1BHK home!");
    }
}

class son extends father2 {
    son(){
        super();
    }  // If fathers constructor need to be called
    void sonHome() {
        super.home();   // In the son method, calling the father method using the super key word
        System.out.println(super.gold); // In the son method, calling the father variable using the super key word
    }

}
