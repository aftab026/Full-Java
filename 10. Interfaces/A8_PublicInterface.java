// q:- 8. Create a PUBLIC interface with fields and methods, fields should have values assigned. 
// Implement this interface to some class and print the values of the interface fields and 
// call the interface methods

interface InterfacePublicFieldsMethod {
    int a = 1234;

    public void methodOne();
}

public class A8_PublicInterface implements InterfacePublicFieldsMethod {
    public void methodOne() {
        System.out.println("This is Method");
    }

    public static void main(String[] args) {
        A8_PublicInterface inf = new A8_PublicInterface();
        System.out.println(a);
        inf.methodOne();

    }
}
