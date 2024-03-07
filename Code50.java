
// Fin the frequenccy of element in java 
/**
 * Code50
 */
import java.util.Arrays;

public class Code50 {

    public static void countFreq(int arr[], int n) {
        boolean visited[] = new boolean[n];
        Arrays.fill(visited, false);

        for (int i = 0; i < n; i++) {
            if (visited[i] == true)
                continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " Occurs " + count + " times ");

        }

    }

    public static void main(String[] args) {
        int arr[] = new int[] { 10, 30, 10, 20, 10, 20, 30, 10 };
        int n = arr.length;
        countFreq(arr, n);
    }

}