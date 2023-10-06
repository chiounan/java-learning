// Arrays class:
// Arrays.toString
// Arrays.binarySearch
// Arrays.copyOfRange
// Arrays.equals
// Arrays.fill

import java.util.Arrays;

public class ArraysClass {

    public static void Arritem(int numbers[]) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void main(String args[]) {
        int[] arr1 = {10, 20, 15, 22, 35};

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
        
        // Compare two arrays
        int[] arr2 = {10, 20, 15, 22, 35};
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
        System.out.println("Arrays comparison: " + Arrays.equals(arr1, arr2));

        // To fill the array
        int[] arr3;     // Using "int arr3[]" is fine.
        arr3 = new int[5];      // Better usage is: int[] arr3 = new int [5];
        int arrkey = 22;
        Arrays.fill(arr3, arrkey);
        System.out.println("Fill the array with " + arrkey + ": " + Arrays.toString(arr3));

    }
}
