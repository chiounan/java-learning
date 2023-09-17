public class Compare {
    
    public static int BigSmall (int a, int b) {
        if (a > b)
            return a;
        else if (a < b)
            return b;
        else
            return 0;
    }

    public static void main (String args[]) {
        int a = 10, b = 5;
        System.out.println(BigSmall(a, b));
    }
}
