package Java_OOPs.ex_38_Feb_20_Excercise.Inheritance;

public class Lab_207_Multi_Level_Inheritance {
    public static void main(String[] args) {
        // Multilevel inheritance - This refer to class is derived from the one class which also again derived to the another class.
        // This chain process is called Multilevel Inheritance

        C2 multilevel = new C2();
        multilevel.A2method();
        multilevel.B2method();
        multilevel.C2method();
    }
}

class A2 {
    void A2method(){
        System.out.println("Hello Am the method from A2 class.");
    }

    A2(){
        System.out.println("Am the default constructor! from Method A2");
    }
}

class B2 extends A2 {
    void  B2method () {
        System.out.println("Hello Am the method from B2 class. ");
    }
    B2() {
        System.out.println("Am the default constructor! from B2 method");
    }
}

class C2 extends B2 {       // This is multilevel inheritance. This class C2 inherits the properties of both A2 and B2.
                            // Because B2 also inherits the properties of A2 in above class.
    void C2method(){
        System.out.println("Hello am the method from C2 class.");
    }

    C2(){
        System.out.println("AM the default constructor from C2 method");
    }
}
