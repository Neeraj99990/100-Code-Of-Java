import java.util.Scanner;

/**
 * Code91
 */
public class Code91 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch (month) {
          case 1 :
                   System.out.println("Jan");
                   System.out.println("31 days");
                   break;
        
                   case 2 :
                   System.out.println("feb");
                   System.out.println("28 days");
                   break;

                   case 3 :
                   System.out.println("may");
                   System.out.println("31 days");
                   break;

                   case 4 :
                   System.out.println("April");
                   System.out.println("30 days");
                   break;

                   case 5 :
                   System.out.println("May");
                   System.out.println("31 days");
                   break;

                   case 6 :
                   System.out.println("June");
                   System.out.println("30 days");
                   break;

                   case 7 :
                   System.out.println("July");
                   System.out.println("31 days");
                   break;

                   case 8 :
                   System.out.println("August");
                   System.out.println("31 days");
                   break;

                   case 9 :
                   System.out.println("Sep");
                   System.out.println("30 days");
                   break;

                   case 10 :
                   System.out.println("Oct");
                   System.out.println("31 days");7
                   break;

                   case 11 :
                   System.out.println("Nov");
                   System.out.println("30 days");
                   break;

                   case 12 :
                   System.out.println("Dec");
                   System.out.println("31 days");
                   break;


           default:
                System.out.println("Invaild Month Number ");

        }
    }
}