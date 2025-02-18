package Java_Concepts.ex_27_OOPs_Inheritance.ex_01_Single_Inheritance.example1_FatherSon;

public class Son extends Father { // Father properties now copied into the son class
                                    // which means son can access all the attributes and functions from father class

    void home2 () {
        System.out.println("Son having 2BHK Home !");
    }
}
