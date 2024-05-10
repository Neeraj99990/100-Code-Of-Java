import java.util.Scanner;

/**
 * Code92
 */
public class Code92 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                     
            System.out.println("Vovel");
                 break;
        
            default:
            System.out.println("Consonenet");
                break;
        }
    }
}