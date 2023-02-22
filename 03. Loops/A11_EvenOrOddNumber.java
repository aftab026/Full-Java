
// q:- 11. Program to check whether a number is EVEN or ODD using switch.
import java.util.*;

public class A11_EvenOrOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();

        switch (num % 2) {
            case 0:
                System.out.println(num + " is an even number");

                break;
            case 1:
                System.out.println(num + " is a odd number");

            default:
                break;
        }
        sc.close();
    }
}
