package Java_OOPs.ex_38_Feb_20_Excercise;

public class Lab_211_Encapsulation {
    public static void main(String[] args) {
        // In java encapsulation is the process of binding the data member and methods in to single class
        //Three way we can achieve this
        //PUBLIC
        //PRIVATE
        //PROTECTED

   //Accessing the rolex class
        rolex r1 = new rolex();
        r1.setTyre(55, true); // You can set the or change the value to 55
        System.out.println(r1.getTyre()); // You can get the value using this function.
    }
}

class rolex {
   private int tyre = 20;

   // Inorder to access the private data you need to use the getter setter methods. Right click > Generate >Getter and Setter

    public int getTyre() {
        return tyre;
    }

    public void setTyre(int tyre, boolean isAdmin) {
        if(isAdmin){                                                // We can set that only admin can change the value.
            System.out.println("Age changed to " + tyre);
            this.tyre = tyre;
        }
        else
        {
            System.out.println("You are not a admin to change this");
        }
    }
}
