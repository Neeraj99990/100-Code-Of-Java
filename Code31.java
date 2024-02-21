// Write  a program to count number of integers which has exactly x divisors 

/**
 * Code31
 */
public class Code31 {

    public static void main(String[] args) {
        int n = 9, x = 2;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int count_factors = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count_factors++;

                }

            }

            if (count_factors == x) {
                count++;

            }

            System.out.println(count);

        }
    }

}
