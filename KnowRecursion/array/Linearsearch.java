package KnowRecursion.array;

import java.util.ArrayList;

public class Linearsearch {
    public static void main(String[] args) {
        int[] arr = {3,18, 2, 18, 18, 9};
        int target = 18;

        System.out.println(searchB(arr, target, 0));
        System.out.println(searchI(arr, target, 0));
        searchIAll(arr, target, 0);
        System.out.println(list);

        ArrayList<Integer> list1 = searchIAllParameter(arr, target, 0, new ArrayList<>());
        System.out.println(list1);

        System.out.println(searchIAllInsideMethod(arr, target, 0));

    }

    public static boolean searchB(int[] arr, int target, int index) {
        if (index == arr.length) return false;

        return arr[index] == target || searchB(arr, target, index + 1);
    }

    public static int searchI(int[] arr, int target, int index) {
        if (index == arr.length) return -1;

        if (arr[index] == target) {
            return index;
        } else {
            return searchI(arr, target, index + 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    public static void searchIAll(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }

        if (arr[index] == target) {
            list.add(index);

        }
        searchIAll(arr, target, index + 1);

    }

    public static ArrayList<Integer> searchIAllParameter(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return searchIAllParameter(arr, target, index + 1, list);
    }

    public static ArrayList<Integer> searchIAllInsideMethod(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>(); // create a clean list every time
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> all = searchIAllInsideMethod(arr, target, index + 1);
        list.addAll(all); // add element of below function to this function
        return list;
    }
}
