import java.util.Arrays;

public class ArraysClass {

    public static void Arritem(int numbers[]) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void main(String args[]) {
        int arr1[] = {10, 20, 15, 22, 35};

        System.out.print("Array1: " + Arrays.toString(arr1));
        //Arritem(arr1);
        System.out.println(" (length: " + arr1.length + ")");

        //Sort array
        Arrays.sort(arr1);
        System.out.print("Array1 sorted: " + Arrays.toString(arr1));
        //Arritem(arr1);
        System.out.println(" ");

        //Binary search
        int key = 22;
        if (Arrays.binarySearch(arr1, key) >= 0)
            System.out.println(key + " found at index " + Arrays.binarySearch(arr1, key) + ".");
        else
            System.out.println(key + " not found in array.");

        //Copy part of array to a string
        System.out.println("Array range between index 1 and 3: " + Arrays.toString(Arrays.copyOfRange(arr1, 1, 3)));

    }
}
