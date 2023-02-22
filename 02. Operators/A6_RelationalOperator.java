// q:- 6. Program for relational operators (<,<==, >, >==).
import java.util.*;
public class A6_RelationalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your first number: ");
        int a = sc.nextInt();

        System.out.println("Enter your second number: ");
        int b = sc.nextInt();

        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);

        sc.close();


    }
}
