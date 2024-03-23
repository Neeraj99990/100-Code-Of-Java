// Java program to toggle each character in a string 
/**
 * Code60
 */
public class Code60 {

    public static void main(String[] args) {
        String s = "Hello World";
        String s1 = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i)))
                s1 = s1 + Character.toLowerCase(s.charAt(i));
            else
                s1 = s1 + Character.toUpperCase(s.charAt(i));

        }

        System.out.println("Toggle String : " + s1);
    }

}
