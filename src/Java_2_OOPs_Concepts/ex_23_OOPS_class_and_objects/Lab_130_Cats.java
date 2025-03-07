package Java_2_OOPs_Concepts.ex_23_OOPS_class_and_objects;

public class Lab_130_Cats {
    public  static void main(String[] args) {

        cat c1 = new cat();
        cat c2 = null; // Reference is created but object is not created.

        c1.running();

         // c2.running(); - Without object creation this cannot be called.


    new cat(); // New object is created without reference
    }

}

class cat {
    String name;

    void running() {
        System.out.println("Running....");
}


}
