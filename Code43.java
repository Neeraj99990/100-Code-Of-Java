public class Code43 {
    public static void main(String[] args) {
        String str = "Hello, world!";
        int length = calculateLength(str);
        System.out.println("Length of the string is: " + length);
    }

    public static int calculateLength(String str) {
        // Base case: if the string is empty or null, return 0
        if (str == null || str.isEmpty()) {
            return 0;
        }
        // Recursive case: remove the first character and call the method recursively
        return 1 + calculateLength(str.substring(1));
    }
}
