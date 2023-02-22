// q:- 6. Use this() and super() in methods not in constructor

//SuperClass
class Parent_01 {
    void method1() {
        System.out.println("Used this() and super() in methods");
    }

    void method2() {
        //using this() to call method1
        this.method1();
    }
}
//SubClass
class Child_02 extends Parent_01 {
    void method3() {
        //using super() to call parent method
        super.method2();
    }
}

public class UsingThisSuper {
    public static void main(String[] args) {
        Child_02 c = new Child_02();
        //Calling method3
        c.method3();
    }
}
