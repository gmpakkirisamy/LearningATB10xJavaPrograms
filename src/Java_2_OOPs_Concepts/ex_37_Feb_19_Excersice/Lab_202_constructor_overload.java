package Java_2_OOPs_Concepts.ex_37_Feb_19_Excersice;

public class Lab_202_constructor_overload {
    public static void main(String[] args) {
    //Can you overload constructors in Java? Give one example, Write a code for that. - Yes, we can overload

        student stu1 = new student(); // It will call the default constructor

        student stu2 = new student(10,12); // Based on the variable is will call the two input parameterized constructor

        student stu3 = new student(10,20,30); // Based on the variable is will call the three input parameterized constructor


        stu1.displayMark();
        stu2.displayMark();
        stu3.displayMark();

        int tot = stu3.totmark();
        System.out.println(tot);

        stu3.noretuntype();
    }
}

class student {

    int mark1, mark2, mark3;

    int totmark(){
        return mark1+mark2+mark3;
    }
    void noretuntype (){
        System.out.println("Am the method which return nothing!");
    }

    student() {
        System.out.println("Am the default constructor is called if no parameters are given");
    }

    student(int mark1_c, int mark2_c){  // Based on the input passed during the time of object creation this constructor
        this.mark1 = mark1_c;           // will be used
        this.mark2 = mark2_c;
        int tot2 = mark1_c+mark2_c;

        System.out.println("This is Parameterized constructor with 2 variables "+tot2);
    }

    student(int mark1_c, int mark2_c, int mark3_c) {  // Based on the input passed during the time of object creation this constructor
        this.mark1 = mark1_c;
        this.mark2 = mark2_c;
        this.mark3 = mark3_c;

        int tot1 = mark1_c+mark2_c+mark3_c;

        System.out.println("This is Parameterized constructor with 3 variables "+tot1);
    }

    void displayMark() {
        System.out.println("All Marks is "+this.mark1 +","+this.mark2 +","+this.mark3);
    }

}