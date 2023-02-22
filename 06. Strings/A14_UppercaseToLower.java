// q:- 14. Converting to uppercase and lowercase.
public class A14_UppercaseToLower {
    public static void main(String[] args) {
        String a = "upper case";
        String b = "LOWER CASE";
        //toUpperCase() method converts lower to upper case
        String c = a.toUpperCase();
        //toLowerCase() method converts upper to lower case
        String d = b.toLowerCase();
        System.out.println("Converted to upper case : " + c);
        System.out.println("Converted yo lower case : " + d);
    }
}
