package Java_2_OOPs_Concepts.ex_39_Feb_21_Excercise;

public class Lab_217_Method_Overlaoding {
    public static void main(String[] args) {
        // Method overloading in java nothing but, the method has been called based on the argument passed
        //during the time of object creation.
        // These all will have same method.

        AdditionOperation addition = new AdditionOperation();
        addition.add();
        System.out.println(addition.add(10,20));
        System.out.println(addition.add(47,89,56));
        System.out.println(addition.add(45,56,89,23));

    }
}

class AdditionOperation {
    void add(){
        System.out.println("Am the empty method which does not return anything");
    }

    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    int add (int a, int b, int c, int d){
        return a+b+c+d;
    }
}