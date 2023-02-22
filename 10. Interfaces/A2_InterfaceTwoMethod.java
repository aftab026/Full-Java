// q:- 02. Create an interface with two methods, but implement only one in a class. Call the
// method implemented.

interface inf {
    void oneMethod();

    void twoMethod();
}

public class A2_InterfaceTwoMethod implements inf {
    public void oneMethod() {
        System.out.println("First Method");
    }

    public void twoMethod() {
        System.out.println("Second Method");
    }

    public static void main(String[] args) {
        A2_InterfaceTwoMethod inf = new A2_InterfaceTwoMethod();
        inf.oneMethod();
        inf.twoMethod();

    }
}

/*
 * NOTE :
 * - A class that implements an interface must implement all the methods
 * declared in the interface.
 */
