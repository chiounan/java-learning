public class ArrayLoop {
    public static int Max(int numbers[]) {
        int max = numbers[0];
        
        for (int num : numbers) {
            if (num > max)
                max = num;
        }
    return max;
    }

    public static int Sum(int numbers[]) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void Arritem(int numbers[]) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void main(String args[]) {
        int numarray[] = {123, 234, 34, 56, 127};

        System.out.print("Array item: ");
        Arritem(numarray);
        System.out.println("");
        System.out.println("Max of array: " + Max(numarray));
        System.out.println("Sum of array: " + Sum(numarray));
    }
}
