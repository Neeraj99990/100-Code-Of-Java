// Java Program to Check if a string contains a substring

/**
 * Code75
 */
public class Code75 {

    public static void main(String[] args) {
        String txt = "This is Coding ";
        String str1 = "Java";
        String str2 = "Kotlin";

        // check if name is present in txt
        // using contains()

        boolean result = txt.contains(str1);
        if (result) {
            System.out.println(str1 + " is present to the string .");
        } else {
            System.out.println(str1 + " is not present in the string .");
        }

        result = txt.contains(str2);
        if (result) {
            System.out.println(str2 + " is present in the string .");
        } else {
            System.out.println(str2 + " is not present in the string ");
        }

    }
}