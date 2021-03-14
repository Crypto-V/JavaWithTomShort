package analysis;

public class Main {
    public static void main(String[] args) {
        SumIntegers sums = new SumIntegers();

        long st_time = System.nanoTime();
        System.out.println(sums.Sum_A(10000));
        long end_time = System.nanoTime();
        long ex_time = end_time-st_time;
        System.out.println("Sum_A execution time: "+ex_time);

        st_time = System.nanoTime();
        System.out.println(sums.Sum_B(10000));
        end_time = System.nanoTime();
        ex_time = end_time-st_time;
        System.out.println("Sum_B execution time: "+ex_time);

        st_time = System.nanoTime();
        System.out.println(sums.Sum_C(10000));
        end_time = System.nanoTime();
        ex_time = end_time-st_time;
        System.out.println("Sum_C execution time: "+ex_time);

    }
}
