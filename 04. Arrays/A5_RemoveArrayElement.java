// q:- 5. Write a function to remove a specific element from an array.
import java.util.*;
public class A5_RemoveArrayElement {
    public static int[] removinngElement(int[] arr, int index){
        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        }

        int[] anotherArray = new int[arr.length-1];

        for(int i = 0, k = 0; i< arr.length; i++){
            if (i == index) {
                continue;
            }
            anotherArray[k++] = arr[i];
        }
        return anotherArray;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.print("Select an index to remove a value from arr = " + Arrays.toString(arr) + ": ");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        System.out.println("Array after removing Element at index " + index);

        arr = removinngElement(arr, index);
        System.out.println("arr = " + Arrays.toString(arr));

        sc.close();
    }
    
}
