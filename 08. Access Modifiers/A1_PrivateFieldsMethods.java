// // q:- 1. Create a class with PRIVATE fields, private method and a main method. Print the fields 
// in main method. Call the private method in main method.
// Create a sub class and try to access the private fields and methods from sub class.

public class A1_PrivateFieldsMethods {
    private  String name = "Aftab";
    private int age = 20;

    private   void pvtMethod(){
        System.out.println("My name is "+ name + " and my age is " + age);
    }
    public static void main(String[] args) {
       A1_PrivateFieldsMethods obj = new A1_PrivateFieldsMethods();

       System.out.println(obj.name);
       System.out.println(obj.age);

       obj.pvtMethod();
    }
}
