// q:- 4.Create two interfaces with one method each. Implement these two interfaces in one class.

interface inf1 {
    void methodOne();
}

interface inf2 {
    void methodTwo();
}

public class A4_TwoInterfaceOneMethod implements inf1, inf2 {
    public void methodOne() {
        System.out.println("This is method one");
    }

    public void methodTwo() {
        System.out.println("This is method two");
    }

    public static void main(String[] args) {
        A4_TwoInterfaceOneMethod inf = new A4_TwoInterfaceOneMethod();
        inf.methodOne();
        inf.methodTwo();
    }
}
