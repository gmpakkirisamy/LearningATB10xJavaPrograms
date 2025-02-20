package Java_OOPs.ex_27_OOPs_Inheritance;

public class Lab_161_Inheritance_Basics {

    //SINGLE INHERITANCE

    //Inheritance in hava, allows one class(the subclass) to inherit attributes and behaviour from another class.
    //Superclass | Parent class | Father class - This is the class where properties and methods are inherited
    //Subclass| Child | Son - The class that inherits from another class
    // CAB -> Class contains - Attributes + Behaviour
    // extends Keyword : Used to indicate that a class is inheriting from another class.
    // Son can extend the Father properties but vice versa is not possible which means Father cannot use the son's properties


    //MULTIPLE INHERITANCE

    // Multiple inheritance is not directly supported by java
    // Which means Son cannot extend from father as well as mother at time
    // THis is called diamond problem in java.
    // Java is not allowed this inheritance.
    // Only way to solve by using the Interface (Data type)


    //MULTILEVEL INHERITANCE

    // Son Class can access the properties of grandfather class and father class in the multilevel.


    //HIERARCHICAL INHERITANCE
    //Same Parent class which share the properties of different sons class
    //example son1, son2, son3, and so on. Can share the Fathers properties.


    //HYBRID INHERITANCE
    //It is the combination of multiple inheritance and multi level inheritance.
    //This is not allowed in java
    //But using interface we can solve this problem.

}
