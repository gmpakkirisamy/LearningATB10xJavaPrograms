package Java_2_OOPs_Concepts.ex_44_Mar_7_Excercise;

public class Lab_260_Child_Inherit_Private {
    public void main(String[] args) {

        child obj1 = new child();
        obj1.display2();
       // obj1.display();  - This is not accessible as it is the private method


    }
    public class parent {

        private void display () {
            System.out.println("Am the private method in the parent class");
        }

    }

    public class child extends parent {

        void display2(){
            System.out.println("Am the method from child class!");
        }

    }
}
