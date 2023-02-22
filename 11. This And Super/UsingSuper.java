// q :- 2. Print the fields/instance members of the parent class using super
//  5. Call constructor of the parent class using super()

//SuperClass
class Parent_01 {
    String name = "Sharan";

    Parent_01() {
        System.out.println("This is parent class constructor");
    }
}

// SubClass
class Child_02 extends Parent_01 {
    String name = "Jala";

    Child_02() {
        // 5. Calling constructor of the parent class using super()
        super();
        System.out.println("This is child class constructor");
    }

    void myMethod() {
        // Printing fields of the parent class using super
        System.out.println("My name is " + super.name);
    }
}

public class UsingSuper {
    public static void main(String[] args) {
        Child_02 c = new Child_02();
        c.myMethod();
    }
}
