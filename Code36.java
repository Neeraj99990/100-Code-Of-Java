
// Java program to find out the quadrant in which the given co-ordinate lie

/**
 * Code36
 */
public class Code36 {

    public static void main(String[] args) {
        int x = -3, y = -33;
        // find true condition of first quadrant
        if (x > 0 && y > 0)
            System.out.println("Quadrant I");

        // Find second quradant
        else if (x < 0 && y > 0)
            System.out.println("Quadrant II");

        // to fod third quardanrt
        else if (x < 0 && y < 0)
            System.out.println("Quadrant III");

        // to find fourth Quardant

        else if (x < 0 && y < 0)
            System.out.println("Quadrant IV");

        // to find dose not lie origin
        else if (x == 0 && y == 0)
            System.out.println("Origin");

        // on x-axis
        else if (y == 0 && x != 0)
            System.out.println("x-axis");

        // On y-axis
        else if (x == 0 && y != 0)
            System.out.println("y-axis");
    }
}