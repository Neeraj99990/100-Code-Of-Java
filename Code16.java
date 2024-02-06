//  Power of a number in java
public class Code16 {
    public static void main(String[] args) {
        double  base = 1.5;
        // work only when expontent is a  positive integer

        int expo = 890;
        double res = 1.0;
        while ( expo != 0 ){
            res *= base;
            expo--;


        }
        System.out.println("Result = " + res );
    }
}