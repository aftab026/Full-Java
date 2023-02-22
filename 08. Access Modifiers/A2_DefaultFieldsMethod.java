// q:- 2. Create a class with DEFAULT fields and methods. Access these fields and methods
// from any other class in the same package.



class DefaultClass_02{
    String name;
    int age;

    void defaultMethod(){
        System.out.println("My name is " + name + " and my age is " + age );
    }
}
public class A2_DefaultFieldsMethod {
    public static void main(String[] args) {
        DefaultClass_02 obj = new DefaultClass_02();

        obj.name = "Aftab";
        obj.age = 20;
        //calling default method
        obj.defaultMethod();
    }
}
