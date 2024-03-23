// Java Program to find length of the string without using length function
/**
 * Code59
 */
public class Code59 {

    public static void main(String[] args) {
        int length = 0;
        String s = "NirajSingh";
        for (char c1 : s.toCharArray())
            length++;

        System.out.println("Length of the string is : " + length);
    }

}