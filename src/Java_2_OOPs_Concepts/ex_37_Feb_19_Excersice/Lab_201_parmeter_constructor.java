package Java_2_OOPs_Concepts.ex_37_Feb_19_Excersice;

import java.util.Scanner;

public class Lab_201_parmeter_constructor {
    public static void main(String[] args) {

//        home h2 = new home(); //If we does not pass any values then default constructor will be called
//        h2.setFan();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the fan");
        String fname1 = sc.nextLine();
        System.out.println("Enter the Tubelight Name");
        String Tname1 = sc.nextLine();

        home h3 = new home(fname1,Tname1);
        // Even though parameterized constructor is not called, automatically will be called based on the parameters given during object creation.
    }
}

class home {
    String fname;
    String lanme;

    void setFan () {
        System.out.println("Fan Turn On!");
    }

//    home(){
//        System.out.println("Am the default constructor which does not have the parameter.");
//    }

    home(String fname_c, String lname_c) {
        this.fname = fname_c;
        this.lanme = lname_c;
        System.out.println("Name of Fan and Light is "+fname_c + lname_c);
    }
}
