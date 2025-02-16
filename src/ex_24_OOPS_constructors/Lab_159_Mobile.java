package ex_24_OOPS_constructors;


public class Lab_159_Mobile {
    public static void main(String[] args) {

        Mobile oppo = new Mobile("Oppo", "AV10", 1000); // Assigning the value to the instance variable during object creation
        System.out.println(oppo.brand);
        System.out.println(oppo.model);
        System.out.println(oppo.price);

        Mobile samsung = new Mobile("Samsung", "M35", 12000);
        System.out.println(samsung.brand);
        System.out.println(samsung.model);
        System.out.println(samsung.price);

        Mobile apple = new Mobile();
    }
}

    class Mobile {  // Instance variable creation
        String brand;
        String model;
        int price;

    Mobile(){   //Default Constructor
        System.out.println("Am DC");
    }
    Mobile(String brand_name, String model_name, int price_pdt) { //Parameterized Constructor

        this.brand = brand_name;
        this.model = model_name;
        this.price = price_pdt;
    }

}

