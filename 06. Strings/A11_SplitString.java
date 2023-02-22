// q:- 11. Splitting strings with split().
public class A11_SplitString {
    public static void main(String[] args) {
        String st = "Splitting String";
        //split() method breaks a given string around matches
        String[] spl = st.split("t"); //splits space

        for (String i : spl) {
            System.out.println("Splitted : " + i);
        }

    }   
}
