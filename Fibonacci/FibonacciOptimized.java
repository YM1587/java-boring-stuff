package Fibonacci;

public class FibonacciOptimized {
    private static long[] fibonacciCache;

    public static void main(String[] args) {
        int n = 50;
        fibonacciCache = new long[n + 1];

        for (int i= 0; i<=n ; i++){
            System.out.println(fibonacci(i) + "");

        }

    }
    public static long fibonacci(int n){
        if (n<= 1){
            return n;
        }
//        when checking for the nth value can't be null since we're using primitive data type long which returns zero on default.
        if (fibonacciCache[n] != 0){
            return fibonacciCache[n];
        }

        long nthFibonacciNumber = (fibonacci(n-1) + fibonacci(n-2));
        fibonacciCache[n] =nthFibonacciNumber;
        return nthFibonacciNumber;
    }


}
