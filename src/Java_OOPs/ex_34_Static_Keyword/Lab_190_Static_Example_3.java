package Java_OOPs.ex_34_Static_Keyword;

public class Lab_190_Static_Example_3 {
    public static void main(String[] args) {

    }
}

class ATB1 {
    {
        System.out.println("IIB- this is called when object is created");
        // Here you can write a code related to start a website or anything before starting the web
        //automation or api automation.
    }


    static {
        System.out.println("Load the class, I will execute!");
    }

    private String name;
    private String phone;
    static String courseName = "ATB10x";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    void readDocuments() {
        System.out.println("Is the Non Static Method");
        System.out.println(courseName);  // But non-static method can access the static variables
    }

    static  void doAssignment() {   // This is static method
       // System.out.println(phone); // We cannot access the non-static variables inside the static method
        // phone is the variable available once the object is created but static method can be created in class loader before the object creation
        System.out.println("Do Assignment!");
    }
}