// Find A Factor number  in java
public class Code17 {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Fcators of " +  num  + " are");

        // Finding and printing factors b/w 1 to num
        for(int i  = 1;  i <= num;  i++)
        {
            if (num % i == 0)
                System.out.println(i + " ");
        }
    }
}

// Time Complexity : O(n)
// Auxiliary Space : O(1)