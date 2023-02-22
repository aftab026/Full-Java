// q:- 10. Write a function to find the duplicate values of an array.
import java.util.*;
public class A10_DuplicateValues {
    public static void duplicateValues(int[] arr) {
        System.out.println("Duplicate values : ");
        for(int i = 0; i< arr.length - 1; i++){
            for(int j = i + 1; j< arr.length; j++){
                if ((arr[i] == arr[j] && (i != j))) {
                    System.out.print(arr[j] + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,4};
        System.out.println("Orignal Array is : " + Arrays.toString(arr));

        duplicateValues(arr);
    }
}
