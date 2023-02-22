
// q:- 3. Program to equal operator and not equal operators.
import java.util.*;

public class A3_EqualNotEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number :");
        int a = sc.nextInt();

        System.out.println("Enter your second number :");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Both are equal numbers");
        } else if (a != b) {
            System.out.println("Both are not equal numbers");
        }
        sc.close();
    }
}
