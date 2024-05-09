/**
 * Code889
 */
public class Code89 {
    public static void main(String[] args) {
        int [] arr = { 10,22 ,28,29,30,40};
        int x = 54;
        findClosestPair(arr, x);
    }

    public static void findClosestPair(int[]arr, int x)
    {
        int left = 0;
        int right = arr.length - 1;
        int diff = Integer.MAX_VALUE;
        int resLeft = -1;
        int resRight = -1;


        while (left < right) {
            if (Math.abs(arr[left] + arr[right] - x) < diff)
            {
                resLeft = left;
                resRight = right;
                diff = Math.abs(arr[left] + arr[right] - x);
            } 
            if (arr[left] + arr[right] > x) {
                right--;
            }
            else 
            {
                left++;
            }
        }

        System.out.println("Closest pair : " + arr[resLeft] + ", " + arr[resRight]);
    }
}