package Java_2_OOPs_Concepts.ex_30_Access_Modifier.Police;

public class cop {
    public int gun;
    String iCard;

    public cop(int gun) {
        this.gun = gun;
    }

    protected void canIshoot() {
        System.out.println("Yes You can shoot!");
    }

}

