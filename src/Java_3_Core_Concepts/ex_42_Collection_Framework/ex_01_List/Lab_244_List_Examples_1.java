package Java_3_Core_Concepts.ex_42_Collection_Framework.ex_01_List;

import java.util.ArrayList;
import java.util.List;

public class Lab_244_List_Examples_1 {
    public static void main(String[] args) {

        Lab_244_List_Examples_1 s1 = new Lab_244_List_Examples_1("Samy","2001");
        Lab_244_List_Examples_1 s2 = new Lab_244_List_Examples_1("Durga", "2002");
        Lab_244_List_Examples_1 s3 = new Lab_244_List_Examples_1("Shadakshi", "2003");

        List<Lab_244_List_Examples_1> myStudents = new ArrayList();

        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);

        System.out.println(myStudents); //you  have to use tostring() in class to display the details


        s1.printDetails();
        s2.printDetails();
        s3.printDetails();

    }
    private String name;
    private String rollNo;

    public Lab_244_List_Examples_1(String name_c, String rollNo_c) {
        this.name = name_c;
        this.rollNo = rollNo_c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void printDetails() {
        System.out.println("Student Name : " +this.name);
        System.out.println("Student Roll No: " +this.rollNo);
    }

    @Override
    public String toString() {
        return "Lab_244_List_Examples_1{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                '}';
    }
}
