// q:- 1. Create an interface with only one method and implement it in a class. Call the method 
//implemented.

interface inf {
    void oneMethod();
}

public class A1_InterfaceOneMethod implements inf {
    public void oneMethod() {
        System.out.println("This one Method");
    }

    public static void main(String[] args) {
        A1_InterfaceOneMethod inf1 = new A1_InterfaceOneMethod();
        inf1.oneMethod();
    }
}
