// Harshad number or not using Java
public class Code21 {
    public static void main(String[] args) {
        // make a copy of orignal number
         int n = 47;
         // decalere a variable to store sum of digit
        int result = 0;
        //  perfrom logic for calculating sum of digits
        while(n  != 0)
        {
            int pick_last = n % 10;
            result = result + pick_last;
            n = n / 10;
        }
        if ( n % result == 0)
            System.out.println( n + " Harshad Number ");
        else
            System.out.println( n + "Not a Harshad Number ");
    }
}