// 5. Create two interfaces with the same method (same signature) in both the interfaces. 
// Implement these two interfaces in one class. Call the method.

interface inf1 {
    void sameMethod();
}

interface inf2 {
    void sameMethod();
}

public class A5_TwoInterfaceSameMethod implements inf1, inf2 {

    public void sameMethod() {
        System.out.println("This same method in both the interfaces");
    }

    public static void main(String[] args) {
        A5_TwoInterfaceSameMethod inf = new A5_TwoInterfaceSameMethod();
        inf.sameMethod();

    }
}
