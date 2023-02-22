// q:- 1. Write a function to add integer values of an array.
public class A1_AddInteger {
    public static int arrSum(int[] arr){
        int sum = 0;
        for(int i = 0; i< arr.length; i++)
            sum += arr[i];
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        
        System.out.println("Total sum of given Array is : " + arrSum(arr));
    }
}
