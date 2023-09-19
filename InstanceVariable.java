public class InstanceVariable {
    // Declar instance variable outside method or any block
    String geek;
    int i;
    Integer I;
    // default Constructor
    InstanceVariable() {
        this.geek = "initialize the instance variable";
    }
    public static void main(String args[]) {
        // Create object
        InstanceVariable iv = new InstanceVariable();
        // set values for object
        iv.geek = "Test";
        iv.i = 1;
        iv.I = 2;

        System.out.println("InstanceVariable String: " + iv.geek);
        System.out.println("InstanceVariable int: " + iv.i);
        System.out.println("InstanceVariable Integer: " + iv.I);
    }
}
