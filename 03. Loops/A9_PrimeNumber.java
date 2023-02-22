
//  q:- 9. Write a program to find the prime or not.
import java.util.*;

public class A9_PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean b = true;
        
        for (int i = 2; i < n; i++) {
            
            if (n % i == 0) {
                b = false;
            } 

        }
        System.out.println(b);

        sc.close();

    }
}
