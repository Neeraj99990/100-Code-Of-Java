public class Code33 {
    public static void main(String[] args) {
        int a = 1, b = 100;
        for (int i = a; i <= b; i++) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean checkPrime(int num) {

        // 0, 1 and negative numbers are not prime
        if (num < 2) {
            return false;
        } else {

            // no need to run loop till num-1 as for any number x the numbers in
            // the range(num/2 + 1, num) won't be divisible anyways.
            // Example 36 wont be divisible by anything b/w 19-35
            int x = num / 2;
            for (int i = 2; i < x; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        // the number would be prime if we reach here
        return true;
    }

}
