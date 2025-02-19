package Java_OOPs.ex_24_OOPS_constructors;

public class Lab_135_Para_constructor_class {
    String name;
    int year;

    Lab_135_Para_constructor_class() {
        // This is default constructor
        name = "NYD";
        year = 0000;
    }

    //Parameterized Constructor
    Lab_135_Para_constructor_class(String model_name, int model_year) {
        this.name = model_name;
        this.year = model_year;
    }

}


