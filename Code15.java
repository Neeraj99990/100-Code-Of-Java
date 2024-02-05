//  Program to find N-th Fibonacci Number in Java
public class Code15 {
    static  int fib(int n)
    {
        if (n <= 1)
            return  n;
        return fib(n -1) + fib(n-2);

    }

    public static void main(String[] args) {
        int n = 18;
        System.out.println(fib(n));
    }
}
