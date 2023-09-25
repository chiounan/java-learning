import java.util.Scanner;

public class SwitchCase {
    public static int Even(int e) {
        return e % 2;
    }

    public static void main(String args[]) {
        int num;
        Scanner scn = new Scanner(System.in);

        System.out.print("Input a number: ");
        num = scn.nextInt();
        switch (Even(num)) {
            case 0 : System.out.println(num + " is even number.");
                break;
            case 1 : System.out.println(num + " is odd number.");
                break;
            default : System.out.println(num + " is not a number.");
        }
    }
}
