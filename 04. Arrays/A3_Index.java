//  q:- 3. Write a program to find the index of an array element.
import java.util.*;
public class A3_Index {

    public static void arrIndex(int[] arr, int n){
        for(int i=0; i<arr.length; i++){
            if(n == arr[i]){
                System.out.println(n + " is at index " + i);
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("arr = " + Arrays.toString(arr));
        
        System.out.print("Select any array number to find the index of array : ");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextByte();

        arrIndex(arr, index);

        sc.close();
    }
}
