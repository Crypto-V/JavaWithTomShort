package basics;

public class FibonacciApp {
    public static void main(String[] args) {
        //Fibonacci number is defined by the sum of two previous numbers!
        // 0,1,1,2,3,5,8,13
        System.out.println(fib(9));
    }

    public static int fib(int n){
        if (n == 0){
            return 0;
        }else if (n == 1){
            return 1;
        }
        return(fib(n-1)+fib(n-2));
    }
}
