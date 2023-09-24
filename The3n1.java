import java.util.Scanner;

public class The3n1 {

    public static int even(int e) {
        return e % 2;
    }
    public static void main(String args[]) {
        int n = 22;
        int m = n;
        int lenght = 1;

        Scanner scn = new Scanner(System.in);
        int intn;
        System.out.println("Enter a number:");
        intn = scn.nextInt();
        if (intn >= 0)
            n = intn;
        m = n;
        System.out.println("The 3n + 1 problem of " + n + ":");
        System.out.print(n + " ");
        while (n > 1) {
            if (even(n) == 1)
                n = 3 * n + 1;
            else
                n /= 2;    
            lenght++;    
            System.out.print(n + " ");    
        }
        System.out.println("");
        System.out.println("The cycle-length of " + m + " is " + lenght + ".");
    }
}
