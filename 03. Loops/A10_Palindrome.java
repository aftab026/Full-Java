// q:- 10. Write a program to palindrome or not.
import java.util.*;
public class A10_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v = n;
        int r;
        int pn=0;
    while(n>0){
        r = n%10;
        pn = (pn*10)+r;
        n = n/10;

        
    }
    System.out.println(v==pn);

    sc.close();
    }

}
