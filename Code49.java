// shorting in java 
/**
 * Code49
 */
public class Code49 {

    public static void main(String[] args) {
        int[] arr = new int[] { 10, 40, 30, 20 };
        int temp = 0;

        // Short th array in ascening order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }

        }

        // Displaying elements of array after sorting
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
