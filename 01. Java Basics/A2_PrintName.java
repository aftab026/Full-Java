
// q:- 2. Write a program to print your name.
import java.util.*;

public class A2_PrintName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("My name is " + name);
        sc.close();
    }
}
