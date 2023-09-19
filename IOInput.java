import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IOInput {
    public static void main(String args[]) {
        // Input method 1: BufferedReader
        // InputStreamReader convert bytes to stream of characters
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        String str1;
        int int1;
        try {
            System.out.println("Enter your name:");
            str1 = bufRead.readLine(); // String reading
            System.out.println("Enter your age:");   
            int1 = Integer.parseInt(bufRead.readLine()); // Parsing input intsger

            System.out.println("Name: " + str1);
            System.out.println("Age: " + int1);
        }
        catch (Exception e) {
            System.out.println("Error on input");
        }

        // Input method 2: Scaner
        try (
        Scanner scn1 = new Scanner(System.in)) {
            String str2;
            int int2;
            float flo1;
            System.out.println("Enter your country:");
            str2 = scn1.nextLine(); // read string
            System.out.println("Enter your high:");
            int2 = scn1.nextInt(); // read integer
            System.out.println("Enter your weight:");
            flo1 = scn1.nextFloat();

            System.out.println("Country: " + str2);
            System.out.println("High: " + int2);
            System.out.println("Weight: " + flo1);
        }
        catch (Exception e) {
            System.out.println("Error on input");
        }
    }
}
