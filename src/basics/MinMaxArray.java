package basics;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] numbers = {4,3,6,7,4,32,7};
        System.out.println("The minimum number is: "+findMin(numbers));
        System.out.println("The max number is: "+ findMax(numbers));
        System.out.println("Average is : "+findAverage(numbers));
    }
    public static int findMin(int[] arr){
        int min = arr[0];
        for (int value : arr) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static int findMax(int[] arr){
        int max = arr[0];
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static int findAverage(int[] arr){
        //Take sum and devide by number of elements.
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum/arr.length;
    }
}
