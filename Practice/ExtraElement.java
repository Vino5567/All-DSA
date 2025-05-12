package Practice;

public class ExtraElement {
    public static void main(String[] args) {
        int[] arr1 = {-1, 0, 3, 2};
        int[] arr2 = {3, 4, 0, -1, 2};

        findExtraElement(arr1, arr2);
    }

    private static void findExtraElement(int[] arr1, int[] arr2) {
        int xor = 0;
        int[] larger = (arr1.length > arr2.length) ? arr1 : arr2;
        int[] smaller = (arr1.length > arr2.length) ? arr2 : arr1;
        String arrName = (arr1.length > arr2.length) ? "arr1" : "arr2";

        // XOR all elements from both arrays
        for (int num : larger) xor ^= num;
        for (int num : smaller) xor ^= num;

        // Find the index of the extra element
        for (int i = 0; i < larger.length; i++) {
            if (larger[i] == xor) {
                System.out.println("Extra element: " + xor + " in " + arrName + " at index " + i);
                return;
            }
        }
    }
}
