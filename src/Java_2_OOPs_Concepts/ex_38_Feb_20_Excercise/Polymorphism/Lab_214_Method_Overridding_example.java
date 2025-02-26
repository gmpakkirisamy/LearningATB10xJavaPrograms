package Java_2_OOPs_Concepts.ex_38_Feb_20_Excercise.Polymorphism;

public class Lab_214_Method_Overridding_example {
    public static void main(String[] args) {

        abi abi1 = new abi(); // This is not override
        abi1.am_abi();

        anu anu1 = new anu();  // This is override parrent method.
        anu1.take();
    }
}

class commonToShare {
    void take () {
        System.out.println("I have 20 chacolates so you take only5");
    }
}

class abi extends commonToShare {
    void am_abi (){
        take();
    }
}

class anu extends commonToShare {
    @Override
    void take() {
        System.out.println("I will take 15 Chocolates!");
    }
}