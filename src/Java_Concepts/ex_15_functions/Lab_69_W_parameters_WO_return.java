package Java_Concepts.ex_15_functions;

public class Lab_69_W_parameters_WO_return {
    public static void main(String[] args) {
        //With Parameters and without Return Type
        greet_name("Samy");
        greet_details("Devi", 18);
        greet_infor("Shadakshi",5, 10000);
    }

    static void greet_name(String name){   // Single parameter without return type
        System.out.println("Employee Name is " +name);
    }

    static void greet_details(String name, int age) {// Double parameter without return type
        System.out.println("Employee Name is " +name+ " Age is "+age);
    }

    static void greet_infor(String nam, int ag, double sal){// Tripple parameter without return type
        System.out.println("Employee Name is "+nam + " Age is " +ag+ " and Salary is " +sal);
    }
}
