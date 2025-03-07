package Java_2_OOPs_Concepts.ex_44_Mar_7_Excercise;

public class Lab_259_Override_Less_More_Access {
    public static void main(String[] args) {

    }

    public class Parent {
        protected void display(){
            System.out.println("This is Parent Method!");
        }
    }

    public class  Child extends Parent {

        @Override
        public void display() {
            System.out.println("This is override by the Child from Parent!");
        }

    }
}
