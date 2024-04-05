
// add element to the link list 
import java.util.LinkedList;

/**
 * Code71
 */
public class Code71 {

    public static void main(String[] args) {
        // Create a linkedlist
        LinkedList<String> languages = new LinkedList<>();

        // add element to the link list
        languages.add("Swift");
        languages.add("Python");
        System.out.println("Linkedlist : " + languages);

        languages.add(0, "java");
        System.out.println("Updated Linked list :" + languages);
    }
}