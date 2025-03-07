package Java_2_OOPs_Concepts.ex_24_OOPS_constructors;

import java.util.Scanner;

public class Lab_138_coolDrinks_main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //COKE Input - Using Parameterized Constructor
        System.out.println("Enter the cool drinks brand name :");
        String dname1 = sc.next();;

        System.out.println("Enter how much ml ?");
        int dml1 = sc.nextInt();

        System.out.println("Enter the color of cool drinks: ");
        String dcolor1 = sc.next();

        Lab_137_coolDrinks_class coke = new Lab_137_coolDrinks_class(dname1,dml1,dcolor1);
        System.out.println(coke.dname);
        System.out.println(coke.ml);
        System.out.println(coke.color);

        System.out.println("------------------------");

        //PEPSI Input - Using Parameterized Constructor
        System.out.println("Enter the cool drinks brand name :");
        String dname2 = sc.next();;

        System.out.println("Enter how much ml ?");
        int dml2 = sc.nextInt();

        System.out.println("Enter the color of cool drinks: ");
        String dcolor2 = sc.next();

        Lab_137_coolDrinks_class pepsi = new Lab_137_coolDrinks_class(dname2,dml2,dcolor2);
        System.out.println(pepsi.dname);
        System.out.println(pepsi.ml);
        System.out.println(pepsi.color);

        System.out.println("------------------------");

        //Bovonto Input - Using default constructor
        Lab_137_coolDrinks_class bovonto = new Lab_137_coolDrinks_class();
        System.out.println(bovonto.dname);
        System.out.println(bovonto.ml);
        System.out.println(bovonto.color);



    }
}
