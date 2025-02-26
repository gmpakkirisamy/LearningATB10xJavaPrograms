package Java_3_Core_Concepts.ex_42_Collection_Framework.ex_01_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab_243_List_Get_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        String continueInput = "Y";

        while (continueInput.equalsIgnoreCase("Y")){
            System.out.println("Enter Your Name :");
            String name = sc.next();
            names.add(name);

            System.out.println("Enter Your Age :");
            int age = sc.nextInt();
            ages.add(age);

            System.out.println("Do You Want to Continue ? Type Yes for Y and No for N  :");
            sc.nextLine();
            continueInput = sc.nextLine();
        }

        for (String o : names) {
            System.out.println(o);
        }
        for (int o1 : ages) {
            System.out.println(o1);
        }
    }
}
