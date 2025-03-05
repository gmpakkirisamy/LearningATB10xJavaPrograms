package Java_2_OOPs_Concepts.ex_27_OOPs_Inheritance.ex_01_Single_Inheritance.example2_Browser;

public class TestCase1 extends CommonToAllTest {

    void runningTC1() {
        startBrowser();
        System.out.println("Test case 1 is running!");
        closeBrowser();
        readDatabasefile();
        readExcelfile();
    }

    public static class Lab_163_Testcase_Example {
        public static void main(String[] args) {

        }
    }
}
