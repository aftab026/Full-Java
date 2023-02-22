// q :- 2. Write a function to calculate the average value of an array of integers.
public class A2_AverageValue {
    public static int avgArray(int[] arr) {
        int sum = 0;
        for(int i: arr){
            sum += i;
        }
        int average = sum / arr.length;

        return average;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println("The Average value of given Array is : " + avgArray(arr));
    }
}
