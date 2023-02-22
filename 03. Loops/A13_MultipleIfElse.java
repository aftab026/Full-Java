// q:- 13. Program for multiple if else statement(Largest number in 10,20 and 30).

public class A13_MultipleIfElse {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        if(a>b && b>c){
            System.out.println(a + " is largest number");
        }else if(b>a && b>c){
            System.out.println(b + " is largest number");
        }else{
            System.out.println(c + " is largest number");
        }
    }
}
