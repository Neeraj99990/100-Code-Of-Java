import java.util.Scanner;

/**
 * Code93
 */
public class Code93 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        String ans = num % 2 == 0 ? "Even" : "Odd";

        System.out.println("the ans " + ans);
    }
}

