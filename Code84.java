public class Code84 {
    public static void main(String[] args) {
        int number = 60;

        System.out.println("Factores of " + number + "area:");
        for(int i = 1; i <= number; ++i)
        {
            if(number % i == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
