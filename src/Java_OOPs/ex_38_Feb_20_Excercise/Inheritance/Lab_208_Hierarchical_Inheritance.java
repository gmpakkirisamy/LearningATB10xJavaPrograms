package Java_OOPs.ex_38_Feb_20_Excercise.Inheritance;

public class Lab_208_Hierarchical_Inheritance {
    public static void main(String[] args) {
        //Hierarchical inheritance is nothing but sharing the Superclass attributes and behaviour with the multiple child class or sub class

        Sons1 son1pro = new Sons1();
        son1pro.fahtherhome();
        son1pro.Son1home();

        Sons2 son2pro = new Sons2();
        son2pro.fahtherhome();
        son2pro.Son2home();

        Sons3 son3pro = new Sons3();
        son3pro.fahtherhome();
        son3pro.Son3home();

        Sons4 son4pro = new Sons4();
        son4pro.fahtherhome();
        son4pro.Son4home();

        Sons5 son5pro = new Sons5();
        son5pro.fahtherhome();
        son5pro.Son5home();


    }
}
class Father2 {
    void fahtherhome() {
        System.out.println("This is Fathers Property!");
    }

}

class Sons1 extends Father2 {
    void Son1home() {
        System.out.println("THis is Son1 Property!");
    }
}

class Sons2 extends Father2 {
    void Son2home() {
        System.out.println("THis is Son2 Property!");
    }
}

class Sons3 extends Father2 {
    void Son3home() {
        System.out.println("THis is Son3 Property!");
    }
}

class Sons4 extends Father2 {
    void Son4home() {
        System.out.println("THis is Son4 Property!");
    }
}

class Sons5 extends Father2 {
    void Son5home() {
        System.out.println("THis is Son5 Property!");
    }
}