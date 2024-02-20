// Counting number of days in a given month 

/**
 * Code29
 */
public class Code29 {

    public static void main(String[] args) {
        int arr[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int month = 2, year = 2024;

        // for cheaking leep year
        if (month == 2 && ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0))))
            System.out.println("Number of days is " + arr[month - 1] + 1);

        else
            System.out.println("Number of days is " + arr[month - 1]);
    }
}