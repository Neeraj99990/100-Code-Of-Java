public class Code39 {

    static int arr[] = { 10, 324, 45, 90, 98 };

    // Method to find maximum element in array
    static int largest() {
        int i;
        // Initialize maximum element
        int max = arr[0];

        // Traverse array element form second and and compare every element with current
        // max
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;

    }

    public static void main(String[] args) {
        System.out.println("Largest in givin array is : " + largest());
    }

}
// Code in java ( Largest element of the array using recursion in java )