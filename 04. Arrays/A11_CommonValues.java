import java.util.Arrays;

// q:- 11. Write a program to find the common values between two arrays.
public class A11_CommonValues {
    public static void commonValues(int[] arr1, int[] arr2){
        for (int i: arr1){
            for(int j: arr2){
                if (i == j) {
                    System.out.println("Common values : " + i);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,1,9,3};

        System.out.println("arr1[] = " + Arrays.toString(arr1));
        System.out.println("arr2[] = " + Arrays.toString(arr2));

        commonValues(arr1, arr2);

    }
}
