// q:- 6. Create an interface with a default method and implement it in a class. Do not provide 
// implementation to the default method and call the method.

interface inf {
    default void oneMethod() {
        System.out.println("This is a default method");
    }
}

public class A6_InterfaceDefaultMethod implements inf {
    public static void main(String[] args) {
        A6_InterfaceDefaultMethod inf = new A6_InterfaceDefaultMethod();
        inf.oneMethod();
    }
}
