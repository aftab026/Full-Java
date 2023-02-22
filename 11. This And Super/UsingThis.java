// q:- 1. Print the fields/instance members of the current class using this and without using object
// 3. Call constructor of the current class using this()
// 4. Call argument constructor of current class using this()
public class UsingThis {
    int num;
    String name;

    UsingThis() {
        //3. Calling argument constructor of current class using this()
        this(1, "Aftab");
    }

    UsingThis(int num, String name) {
        //1. Printing fields of the current class using this
        this.num = num;
        this.name = name;
        System.out.println(num + " " + name);

        
    }

    public static void main(String[] args) {
        UsingThis ts1 = new UsingThis();
        UsingThis ts = new UsingThis(2, "JAVA");
    }
}
