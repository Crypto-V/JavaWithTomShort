package basics;

public class FactorialApp {
    public static void main(String[] args) {
        //Factorial is the actual number * by number-1, where 1 is the lowest value.
        System.out.println(makeFactorial(15));
    }

    public static int makeFactorial(int x){
        if(x == 0){return 1;}
        return ( makeFactorial(x-1) * x);
    }
}
