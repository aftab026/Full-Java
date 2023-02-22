// q:- 1. Write a function for arithmetic operators(+,-,*,/).
import java.util.*;

public class A1_ArithmeticOperator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First number");
        int a = sc.nextInt();
        System.out.println("Enter your Second numbers");
        int b = sc.nextInt();

        System.out.println("Addition of two number is " + (a + b));
        System.out.println("Substraction of two number is " + (a - b));
        System.out.println("Multiplication of two number is " + (a * b));
        System.out.println("Division of two number is " + (a / b));
        sc.close();
    }
}
