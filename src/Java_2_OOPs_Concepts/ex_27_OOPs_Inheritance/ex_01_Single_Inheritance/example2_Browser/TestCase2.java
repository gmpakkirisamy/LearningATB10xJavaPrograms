package Java_2_OOPs_Concepts.ex_27_OOPs_Inheritance.ex_01_Single_Inheritance.example2_Browser;

public class TestCase2 extends CommonToAllTest {
    void runningTC2() {
        startBrowser();
        System.out.println("Test case 2 is running!");
        closeBrowser();
        readDatabasefile();
        readExcelfile();
    }
}
