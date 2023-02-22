import java.util.Arrays;

// q:- 14. Write a method to find the second largest number in an array.
public class A14_SecondLargestNumber {
    public static void secondNumber(int[] arr){
        int temp;
        for(int i =0; i<arr.length; i++){
            for(int j= i+1; j< arr.length; j++){
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("The second largest number in Array : " + arr[arr.length - 2]);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,8,5,4};
        System.out.println("arr[] = " + Arrays.toString(arr));

        secondNumber(arr);

    }
}
