// q:- 7. Print the smaller and larger numbers.

public class A7_LargerAndSmallerNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 8;

        int min = (a<b)?a:b;
        int max = (a>b)?a:b;

        System.out.println("Smaller Nummber is " + min);
        System.out.println("Larger Number is " + max);
    }
}
