// Sum of digits of number is java
public class Code9 {
    public static void main(String[] args) {
        int num = 12345, sum =0;

        // loop to find  digits of digits in java
        while (num!=0){
            sum += num % 10;
            num = num / 10;
        }
        // output
        System.out.println("Sum Of Dgits " + sum );

    }
}



