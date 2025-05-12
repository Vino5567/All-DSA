package Practice;

import java.util.HashSet;

public class NumbersWithoutDuplicates {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 3, 5, 6, 1};

        printUniqueNumbers(arr);
    }

    private static void printUniqueNumbers(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        // Insert elements into HashSet (automatically removes duplicates)
        for (int num : arr) {
            set.add(num);
        }

        // Print unique numbers
        System.out.println("Numbers without duplicates: " + set);
    }
}

