// java program to count the sum of numbers in a string
/**
 * Code56
 */
public class Code56 {

    public static void main(String[] args) {
        String str = "abc123def456ghi789";
        int sum = 0;
        StringBuilder numStr = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                numStr.append(c);

            }

            else if (numStr.length() > 0) {
                sum += Integer.parseInt(numStr.toString());
                numStr.setLength(0);
            }
        }

        if (numStr.length() > 0) {
            sum += Integer.parseInt(numStr.toString());
        }

        System.out.println("Sum of the numbers in the string : " + sum);
    }
}
