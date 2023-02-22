// q:- 5. Write a program to print largest number among three numbers.
import java.util.*;
public class A5_LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int a = sc.nextInt();
        System.out.print("Enter your second number: ");
        int b = sc.nextInt();
        System.out.print("Enter your third number: ");
        int c = sc.nextInt();

        if((a>b) && (b>c)){
            System.out.println("Largest number is : " + a);
        } else if((b>a) && (b>c)){
            System.out.println("Largest number is : " + b);
        }else{
            System.out.println("Largest number is : " + c);
        }

        sc.close();
    }
}
