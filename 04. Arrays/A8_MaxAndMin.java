import java.util.*;



// q:- 8. Write a function to find the minimum and maximum value of an array.

public class A8_MaxAndMin {
    public static int minMaxValue(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            // if(arr[i] > max){
            //     max = arr[i];
                
            // } 
            max = Math.max(max,arr[i]);
            // if(arr[i] < min){
            //     min = arr[i];
            //     System.out.println("Minimum number is : " + min);
            // }
            min = Math.min(min,arr[i]);
            
            
            
        }
        System.out.println("Maximam value is : " + max);

        return min;
        
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 3, 99, 33, 77, 12, 44 };
        System.out.println("Original Array is : " + Arrays.toString(arr));
        System.out.println("Minimum value is : " + minMaxValue(arr));
        
    }
}
