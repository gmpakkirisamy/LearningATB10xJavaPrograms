package ex_25_Array_SelfExcersice;

public class Lab_153_enum {
    public static void main(String[] args) {
        for(level myVar : level.values()){
            System.out.println(myVar);
        }
    }
}
 enum level {
    LOW,
     HIGH,
     MEDIUM
 }