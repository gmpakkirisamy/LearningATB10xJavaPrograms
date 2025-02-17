package ex_28_OOPs_Polymorphism.Method_Oveloading;

public class Addition_operation {

    //Methods with different types of parameters

    int add(int a, int b) {
        return a+b;
    }

    int add(int a, int b, int c) {
        return a+b;
    }

    double add(double a, double b) {
        return a+b;
    }
}
