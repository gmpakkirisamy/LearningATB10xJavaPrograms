package Java_2_OOPs_Concepts.ex_35_ENUM;

public class Lab_194_Enum_colors {
    public static void main(String[] args) {
        System.out.println(Colors.BLUE.getHexCode());
    }
}

enum Colors {
    RED("#WERTY"),
    GREEN("#JFDKJH"),
    BLUE("#BMNVCM");

    private String hexCode;
    Colors (String hexCode_c){
        this.hexCode = hexCode_c;
    }
    String getHexCode() {
        return this.hexCode;
    }

}
