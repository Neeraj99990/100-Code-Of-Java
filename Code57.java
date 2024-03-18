// Java program to Sort an array according to the order defined by another array 

import java.util.*;

public class Code57 {
    public static void main(String[] args) {
        int[] arr1 = { 2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8 };
        int[] arr2 = { 2, 1, 8, 3 };

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], i);
        }

        Integer[] boxedArr1 = Arrays.stream(arr1).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedArr1, Comparator.comparingInt(e -> map.getOrDefault(e, Integer.MAX_VALUE)));

        int[] sortedArr1 = Arrays.stream(boxedArr1).mapToInt(Integer::intValue).toArray();

        System.out.println("Sorted array: " + Arrays.toString(sortedArr1));
    }
}
