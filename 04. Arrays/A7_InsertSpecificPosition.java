// q:- 7. Write a function to insert an element at a specific position in the array.
import java.util.*;

public class A7_InsertSpecificPosition {

    public static void insertElement(int[] arr, int index, int v){
        for(int i = arr.length; i<= index; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = v;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println("Original Array is : " + Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index number : ");
        int index = sc.nextInt();

        System.out.printf("Enter the value to insert at index arr[%d] = ", index);
        int v = sc.nextInt();

        insertElement(arr, index, v);
        System.out.println("Array ");
        System.out.println(Arrays.toString(arr));

        sc.close();

    }
}
