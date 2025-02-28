package Java_2_OOPs_Concepts.ex_24_OOPS_constructors;

public class Lab_137_coolDrinks_class {
    String dname;
    int ml;
    String color;

    //Default Constructor

    Lab_137_coolDrinks_class() {
        dname = "not defined";
        ml = 0000;
        color = "color not defined";
    }

    //Parameterized Constructor

    Lab_137_coolDrinks_class(String drink_name, int drink_ml, String drink_color) {
        this.color = drink_color;
        this.dname = drink_name;
        this.ml = drink_ml;
    }
}
