// q:- 6. Write a function to copy an array to another array.
import java.util.*;
public class A6_CopyArray {
    public static void copyingArray(int arr[]){
        int [] copy = arr;

        System.out.println("Copy Array is : " + Arrays.toString(copy));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store : ");
        int n = sc.nextInt();

        System.out.println("Enter the Element of the array");

        int[] my_arr = new int[n];
        for (int i = 0; i< n; i++){
            System.out.printf("my_arr[%d] = ", i);

            my_arr[i] = sc.nextInt();
        }
        System.out.println("my_arr = " + Arrays.toString(my_arr));
        copyingArray(my_arr);

        sc.close();

    }
}
