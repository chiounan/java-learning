import java.util.Arrays;

public class BinSearch {
    int BinarySearch(int array[], int x) {
        
        int left = 0, right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == x)
                return middle;

            if (array[middle] < x)
                left = middle + 1;
            else
                right = middle - 1;
        }
        return -1;
    }

    public static void main(String args[]) {
        int array[] = {2, 4, 5, 6, 7, 10, 21, 30, 42};
        int n = array.length;
        int x = 22;
        BinSearch bs = new BinSearch();
        int result = bs.BinarySearch(array, x);

        System.out.println("Array: " + Arrays.toString(array));

        if (result == -1)
            System.out.println("Element " + x + " not found.");
        else
            System.out.println("Element " + x + " found at index: " + result);
    }
}
