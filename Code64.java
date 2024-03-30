
//Java program to Remove spaces from a string
import java.util.Scanner;

/**
 * Code64
 */
public class Code64 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "i love you  ";
        char[] c = s.toCharArray();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < c.length; i++) {
            if ((c[i] != ' ') && (c[i] != '\t')) {
                sb.append(c[i]);
            }
        }
        System.out.println("String after removing spaces : " + sb);
    }
}
