package Java_2_OOPs_Concepts.ex_43_Mar_6_Excersice.Checking_Folder_1;

public class Lab_255_Private_Public_Protected_Default {
    public static void main(String[] args) {
        Lab_255_Private_Public_Protected_Default check = new Lab_255_Private_Public_Protected_Default();
        check.display();
    }

    private void display() {
        System.out.println("Am Private Method Accessible with in the same class!");
    }

    protected void display1() {
        System.out.println("Am the Protected Method which is accessible within the same folder");
    }

    public void display3() {
        System.out.println("Am the Public Method, i can access anywhere in the project");
    }

    void display4() {
        System.out.println("Am the Default method where nothing will be mentioned in the function. I can be accessed within its own package");
    }
}

