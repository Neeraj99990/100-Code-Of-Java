// java code to Check a Character is a Vowel or Consonant  
/**
 * Code52
 */
public class Code52 {

    public static void main(String[] args) {
        char ch = 'a';

        // converts the character to lowercase to handle both case
        ch = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel ");
        } else {
            System.out.println(ch + "is a consonant");
        }
    }
}