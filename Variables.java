public class Variables {
    // Static variable
    static String sta1 = "sta1";
    
    // Declar instance variable outside method or any block
    String ins1;
    int ins2;
    Integer ins3;
    // Constructor
    public Variables() {
        this.ins1 = "ins1";
        this.ins2 = 5;
        this.ins3 = 10;
    }

    public static void main(String args[]){
        // Create object of Variable
        Variables va = new Variables();
        
        // Local variable
        String lo1 = "lo1";

        System.out.println("Static variable: " + sta1);
        System.out.println("Instance variable: " + va.ins1);
        System.out.println("Local variable: " + lo1);
    }

}
