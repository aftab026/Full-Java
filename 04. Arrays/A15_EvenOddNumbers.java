
// q:- 15. Write a method to find number of even number and odd numbers in an array.
import java.util.*;

public class A15_EvenOddNumbers {
    public static void evenNumber(int[] arr) {
        System.out.print("Even numbers in array : ");

        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void oddNumber(int[] arr) {
        System.out.print("\n Odd numbers in array : ");

        for (int j : arr) {
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("a[] = " + Arrays.toString(arr));

        evenNumber(arr);
        oddNumber(arr);
    }
}
