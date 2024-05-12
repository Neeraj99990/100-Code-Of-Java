import java.util.Scanner;

public class Code100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Your Password ");
        int Password = scanner.nextInt();

        System.out.println("Hello, mr  " + name + "! Your password  " + Password  + " ");

        scanner.close();
    }
}
