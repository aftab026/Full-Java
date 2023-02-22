// q:- 4. Write a function to test if array contains a specific value.
import java.util.*;
public class A4_SpecificValue {
    static boolean arrSpecific(int arr[], int n){
        for(int i : arr){
            if (i == n){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.print("Enter any value which should be searched : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean hasValue = arrSpecific(arr, n);

        if (hasValue){
            System.out.println("Contains " + n + " in the array");
            System.out.println(Arrays.toString(arr));
        }else{
            System.out.println("Does not Contains " + n + " in the array");
            System.out.println(Arrays.toString(arr));
        }

        sc.close();


    }
}
