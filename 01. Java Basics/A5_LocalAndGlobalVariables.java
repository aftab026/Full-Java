// q:- 5. Define the local and Global variables with the same name and print both variables and 
//understand the scope of the variables

public class A5_LocalAndGlobalVariables {
    int a = 1;

    public void localVariable() {
        int a = 2;
        System.out.println("Local variable a : " + a);
    }

    public static void main(String[] args) {
        A5_LocalAndGlobalVariables obj = new A5_LocalAndGlobalVariables();
        System.out.println("Instance variable a :" + obj.a);
        obj.localVariable();
    }
    // Note : In Java no any concepts for Global Variables.
}
