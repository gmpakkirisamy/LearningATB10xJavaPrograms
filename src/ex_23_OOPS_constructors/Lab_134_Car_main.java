package ex_23_OOPS_constructors;

public class Lab_134_Car_main {
    public static void main(String[] args) {

        Lab_133_Car_class a1 = new Lab_133_Car_class();

        a1.name = "Audi";
        a1.year = 2024;
        a1.colour ="Blue";

        System.out.println(a1.name);  // If the values are not assigned for name/colour/year. Then the
        System.out.println(a1.colour); //Default value will be assigned by the constructor.
        System.out.println(a1.year);

        //Creating another object using the class

        Lab_133_Car_class nano = new Lab_133_Car_class();

        nano.name = "NANO";
        nano.year = 2015;
        nano.colour = "RED";

        System.out.println(nano.name);  // If the values are not assigned for name/colour/year. Then the
        System.out.println(nano.colour); //Default value will be assigned by the constructor.
        System.out.println(nano.year);

        // As of now here there are  two objects are created.
    }
}
