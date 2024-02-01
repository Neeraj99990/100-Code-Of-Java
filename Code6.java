// Check Whether or Not the Year is a Leap Year in Java

public class Code6 {
    public static void main (String[]args)
    {

        int year = 2024;

        if (year % 400 == 0)
            System.out.println (year + " is a Leap Year");

        else if (year % 4 == 0 && year % 100 != 0)
            System.out.println (year + " is a Leap Year");

        else
            System.out.println (year + " is not a Leap Year");

    }
}