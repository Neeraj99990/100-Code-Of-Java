// LCM of two numbers using java
/**
 * Main
 */
public class Code25 {

    public static void main(String[] args) {
        int num1 = 12, num2 = 14, lcm = 0;

        // findiing the largest number here

        int max = (num1 > num2) ? num1 : num2;

        // LCM will atleast be > = max(num1, num2)
        for (int i = max; i <= num1 * num2; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                lcm = i;
                break;
            }
        }
        System.out.println("THe LCM : " + lcm);
    }
}
