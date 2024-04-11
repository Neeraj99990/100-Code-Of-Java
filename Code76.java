public class Code76 {

    public static void main(String[] args) {
        int[] numbers = { 5, 10, 15, 20, 25 };

        for (int number : numbers) {
            displayBinaryGraph(number);
            System.out.println(); // Move to the next line for the next number
        }
    }

    public static void displayBinaryGraph(int number) {
        StringBuilder binaryString = new StringBuilder(Integer.toBinaryString(number));

        // Add leading zeros if necessary to make the binary string length 8
        while (binaryString.length() < 8) {
            binaryString.insert(0, '0');
        }

        // Display the binary graph
        for (char c : binaryString.toString().toCharArray()) {
            System.out.print(c == '1' ? '*' : ' ');
        }
    }
}
