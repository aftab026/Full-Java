// q:- 6. Matching a String Against a Regular Expression With matches().
public class A6_MatchingString {
    public static void main(String[] args) {
        String ms = "My name is Aftab";

        boolean match = ms.matches("(.*)Aftab(.*)");
        System.out.println(match);
    }
}
