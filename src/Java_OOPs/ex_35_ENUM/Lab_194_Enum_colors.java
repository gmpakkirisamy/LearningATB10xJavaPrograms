package Java_OOPs.ex_35_ENUM;

public class Lab_194_Enum_colors {
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
