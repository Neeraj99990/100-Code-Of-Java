// write a code to reverse a number in java
public class Code10 {
    public static void main(String[] args) {
        int num = 1234,  reverse = 0, rem;
        // loop to find number of string
         while ( num != 0)
         {
             rem = num % 10;
             reverse = reverse * 10 + rem;
             num /= 10;

         };

         // output
        System.out.println("Reverse number " + reverse);

    }
}
