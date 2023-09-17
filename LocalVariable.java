public class LocalVariable {
    public static void main (String args[]) {
        int x = 10;
        String message = "Hello";

        System.out.println("x = " + x);
        System.out.println("message = " + message);

        if (x > 5) {
            String result = "x is bigger than 5";
            System.out.println(result);
        }
        // System.out.print(result);

        for (int i = 0; i < 3; i++) {
            String loogmessage = "Iteration :";
            System.out.println(loogmessage + i);
        }
        // System.out.println(loogmessage + i);
    }    
}
