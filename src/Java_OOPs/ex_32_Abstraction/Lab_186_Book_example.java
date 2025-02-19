package Java_OOPs.ex_32_Abstraction;

public class Lab_186_Book_example {
    public static void main(String[] args) {
    book myBook = new PrintMyBook(); // This is dynamic dispatch - Its says that you can create the PrintMyBook object with the book reference
    myBook.getDetails("Harry Potter","J.K.Rowling",120);
    }
}

class PrintMyBook extends book {
    @Override
    void getDetails(String name, String author, int price) {
        System.out.println(name+","+author+","+price);
    }
}

abstract class book {
    abstract void getDetails(String name, String author, int price);
}

