
//  q:- 12. Print gender (Male/Female) program according to given M/F using switch.
import java.util.*;

public class A12_MaleFemale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entet your character (M/F)");
        char Gender = sc.next().charAt(0);

        switch (Gender) {
            case 'M':
                System.out.println("Gender is Male");
                break;
            case 'F':
                System.out.println("Gender is Female");
                break;

            default:
                break;
        }
        sc.close();
    }
}
