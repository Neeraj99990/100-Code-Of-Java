// Write a Program to print the occurence of digit in a givin number 
/**
 * Code32
 */
public class Code32 {

    public static void main(String[] args) {
        int n = 898989, count = 0;
        int d = 9;
        while (n > 0) {
            int rem = n % 10;
            if (rem == d) {
                count++;
                n /= 10;

            }
            System.out.println(count);

        }
    }
}
