package Java_Concepts.ex_34_Static_Keyword;

public class Lab_188_Static_Example_2 {
    public static void main(String[] args) {
        ATB samy = new ATB(9245250007L,"Samy");
        ATB person1 = new ATB(9865377205L, "person1");
        System.out.println(samy.cell_no);
        System.out.println(samy.name);
        System.out.println(ATB.course_name); // These are common for all
        ATB.m1(); // These are common for all
        System.out.println("-----------------------------------------------");
        System.out.println(person1.cell_no);;
        System.out.println(person1.name);
        System.out.println(ATB.course_name);
        ATB.m1();

    }
}

class ATB {
    static String course_name = "ATB";
    long cell_no ;
    String name;

    public ATB (long cell_no_c, String name_c) {
        this.cell_no = cell_no_c;
        this.name = name_c;
    }

    void display() {
        System.out.println(this.cell_no + this.name + course_name);
    }

    static  void m1(){
        System.out.println("Mark Attendance!");
    }
}
