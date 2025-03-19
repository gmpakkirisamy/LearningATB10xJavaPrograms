package Java_2_OOPs_Concepts.ex_24_OOPS_constructors;

import java.util.Scanner;

public class Lab_136_Para_constructor_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Tesla Model name");
        String name1 = sc.next();
        Lab_135_Para_constructor_class tesla = new Lab_135_Para_constructor_class(name1,1996);
        System.out.println(tesla.name);
        System.out.println(tesla.year);

        System.out.println("Enter the Audi Model name");
        String name2 = sc.next();
        Lab_135_Para_constructor_class audi = new Lab_135_Para_constructor_class(name2,2025);
        System.out.println(audi.name);
        System.out.println(audi.year);

        sc.close();
    }
}
