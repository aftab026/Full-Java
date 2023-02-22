// q:- 4. Write a program to find the two numbers equal or not.
import java.util.*;
public class A4_Numbers_EqualOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First number: ");
        int a = sc.nextInt();

        System.out.println("Enter your Second number: ");
        int b = sc.nextInt();

        if (a == b){
            System.out.println("Numbers are Equal ");
        } else {
            System.out.println("Numbers are not equal");
        }
        sc.close();
    }
}
