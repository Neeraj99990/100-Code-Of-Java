
// Remove element in link list in java 
/**
 * Code72
 */
import java.util.LinkedList;

/**
 * Code72
 */
public class Code72 {

    public static void main(String[] args) {
        LinkedList<String> languages = new LinkedList<>();

        // add element in linkedList
        languages.add("java");
        languages.add("swift");
        languages.add("JavaScript");
        languages.add("kotlin");

        System.out.println("Original  list : " + languages);

        // remove element form index
        String str = languages.remove(3);
        System.out.println("Remove element : " + str);
        System.out.println("Updated list : " + languages);

    }
}