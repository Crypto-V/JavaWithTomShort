package analysis;

public class SumIntegers {

    public SumIntegers() {

    }

    public long Sum_A(int n) {
        long sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;

    }

    public long Sum_B(int n) {
        long sum = 0;
        for (long i = 1; i <= n; i++) {
            for (long j = 1; j <= 1; j++) {
                sum += i;
            }
        }
        return sum;
    }

    public long Sum_C(int n) {
        long sum = 0;

        sum = (n * (n - 1)) / 2;
        return sum;
    }

}
