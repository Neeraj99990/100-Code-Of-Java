// calculate the sum of array in  java 
/**
 * Code47
 */
public class Code47 {

    public static void main(String[] args) {
        int arr[] = { 1, 23, 43, 45, 67 };
        int sum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.print(sum);
    }
}