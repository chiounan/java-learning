// Static variables are also known as calss variables.
// These variables are declared using the 'static' keyword within a class 
// and outside of any method, constructor, or block, just like Instance Variable.

public class StaticVariable {
    // Declare static variable
    static String geek = "This is static variable";
    public static void main (String args[]) {
        System.out.println("geek: " + StaticVariable.geek);
        // Static variable can be accessed without object creation (new)
        // StaticVariable sv = new StaticVariable();
    }
}
