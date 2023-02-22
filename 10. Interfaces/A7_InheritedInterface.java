// q:- 7. Create an interface and inherit it from the other interface.

interface inf1 {
    void methodOne();
}
interface inf2 extends inf1{
    void methodTwo();
}
public class A7_InheritedInterface implements inf2{
    public void methodOne() {
        System.out.println("This is first method");
    }
    public void methodTwo() {
        System.out.println("This is second method");
    }
    public static void main(String[] args) {
        A7_InheritedInterface inf = new A7_InheritedInterface();

        inf.methodOne();
        inf.methodTwo();
    }
}
