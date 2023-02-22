// q:- 8. equalsIgnoreCase(), startsWith(), endsWith() and compareTo()

public class A8_ComparingString {
    public static void main(String[] args) {
        String cs1 = "Comparing strings";
        String cs2 = "Comparing strings";

    
        //equalsIgnoreCase() method ignores case differences
        boolean eic = cs1.equalsIgnoreCase(cs2);
        System.out.println("Equal(ignore case) : " + eic);

        //startsWith() method checks string begins
        boolean sw = cs1.startsWith("Comp");
        System.out.println("Starts with : " + sw);

        //endsWith() method checks string ending
        boolean ew = cs1.endsWith("ings");
        System.out.println("Ends with : " + ew);

        //compareTo() method returns 0 if both are equal
        int ct = cs1.compareTo(cs2);
        System.out.println("Compared : " + ct);
    }
}
