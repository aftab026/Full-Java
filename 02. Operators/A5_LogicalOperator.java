// q:- 5. Programs on Logical AND,OR operator and Logical NOT.
import java.util.*;
public class A5_LogicalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First number: ");
        int a = sc.nextInt();

        System.out.println("Enter your Second number: ");
        int b = sc.nextInt();

        System.out.println("Enter your Third number: ");
        int c =  sc.nextInt();

        if (a > b && b > c) {
            System.out.println("True");
        } else{
            System.out.println("False");
        }

        if (a > b || b > c){
            System.out.println("True");
        } else{
            System.out.println("False");
        }

        System.out.println(!(a > b));
        sc.close();
    }
}
