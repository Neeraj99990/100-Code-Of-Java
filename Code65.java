/**
 * Code65
 */
public class Code65 {

    public static void main(String[] args) {
        String str = "a2c5";
        int sum = 0;
        StringBuilder numStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                numStr.append(ch);
            } else {
                if (numStr.length() > 0) {
                    sum += Integer.parseInt(numStr.toString());
                    numStr.setLength(0);
                }
            }
        }
        // Add the last number if there is one
        if (numStr.length() > 0) {
            sum += Integer.parseInt(numStr.toString());

        }
        System.out.println("Sum of the numbers in the string: " + sum);
    }
}