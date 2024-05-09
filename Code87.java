import java.util.Arrays;

public class Code87 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int elementToRemove = 3;
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        // Find the index of the element to remove
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToRemove) {
                index = i;
                break;
            }
        }
        
        // If element is found, remove it
        if (index != -1) {
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            // Resize the array
            arr = Arrays.copyOf(arr, arr.length - 1);
            System.out.println("Array after removing " + elementToRemove + ": " + Arrays.toString(arr));
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
