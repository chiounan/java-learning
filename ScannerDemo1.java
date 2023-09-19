import java.util.Scanner;

public class ScannerDemo1 {
    // Read integer inputs then calculate their sum and mean 
    public static void main(String args[]) {
        try (Scanner scn2 = new Scanner(System.in)) {
            int sum = 0, count = 0;

            System.out.println("Input numbers for calculation or 'q' to exit.");
            while (scn2.hasNextInt()) {
                int num = scn2.nextInt();
                sum += num;
                count++;
            }
            if (count > 0) {
                int mean = sum / count;
                System.out.println("Number of input:" + count);
                System.out.println("Sum = " + sum);
                System.out.println("Mean = " + mean);
            }
            else {
                System.out.println("No integer values.");
            }
        }
        catch(Exception e) {
            System.out.println("IO error.");
        }
    }
}