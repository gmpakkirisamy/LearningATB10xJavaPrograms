package Java_2_OOPs_Concepts.ex_28_OOPs_Polymorphism.Method_Overriding;

public class Lab_171_PG_Guest {
    public static void main(String[] args) {

        pgAdmin pg1 = new pgAdmin();
        pg1.food();
        System.out.println("-------------------------------------");

        guest1 gu1 = new guest1();
        gu1.eat1();
        System.out.println("-------------------------------------");

        guest2 gu2 = new guest2();
        gu2.food();
        System.out.println("-------------------------------------");

        guest3 gu3 = new guest3();
        gu3.food();
        System.out.println("-------------------------------------");

    }
}

class pgAdmin {
    void food(){
        System.out.println("We will serve Chitra Anna!");
    }
}

class guest1 extends pgAdmin {
    void eat1(){
        food();
    }
}

class guest2 extends pgAdmin {
    @Override
    void food() {
        System.out.println("I will replace Chitra anna to Noodles!");
    }
}

class guest3 extends pgAdmin {
    @Override
    void food() {
        System.out.println("I will replace chitra anna to Fried rice!");
    }
}