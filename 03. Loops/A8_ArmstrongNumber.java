// q:- 8. Write a program to find Armstrong number or not.

public class A8_ArmstrongNumber {
    public static void main(String[] args) {
        int v = 37;
        int n = v;
        int r;
        int sum = 0;
        while (n != 0) {
            r = n % 10;
            sum += Math.pow(r, 3);
            n = n / 10;

        }
        if (sum == v) {
            System.out.println("It is an Armstrong Number");
        } else {
            System.out.println("It is not an Armstrong Number");
        }

    }
}
