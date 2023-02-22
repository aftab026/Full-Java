// q:- 2. Write a method for increment and decrement operators(++, --).

public class A2_IncrementDecrementOperator {
    public static void preIncrement(int a, int b){
        int d;
        d = b + (++a);
        System.out.println("Values after PreIncrement of a, b :"+ a+"," + d );
    }

    public static void postIncrement(int a, int b) {
        int d;
        d = b + (a++);
        System.out.println("Values after PostIncrement of a,b :" + a + "," + d);
    }

    public static void preDecrement(int a , int b) {
        int d;
        d = b + (--a);
        System.out.println("Values after PreDecrement of a,b : " + a + "," + d);
    }

    public static void postDecrement(int a, int b) {
        int d;
        d = b + (a--);
        System.out.println("Values after PostDecrement of a,b : " + a + "," + d);
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        
        preIncrement(a, b);
        postIncrement(a, b);
        preDecrement(a, b);
        postDecrement(a, b);
    }
}
