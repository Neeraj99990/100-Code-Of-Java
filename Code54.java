import java.util.Scanner;

/**
 * Code54
 */
public class Code54 {

    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row");
        int row = sc.nextInt();
        for (i = 1; i <= row; i++) {
            for (j = i; j <= row; j++)
                System.out.print(" ");
            for (j = 1; j <= i; j++)
                System.out.print(j + "");
            for (j = i - 1; j >= 1; j--)
                System.out.print(j + "");
            System.out.println();
        }
    }
}

// Palindromic pyramid pattern using java