package dataStructures;

import static java.lang.Math.abs;

public class ZeArray {

//    private static int[] myArray = {23, 34, 21, 55, 12, 37};
//    private int startup;
//
//    //default constructor
//
//    public ZeArray() {
//        startup = 1;
//    }
//
//    public ZeArray(int str) {
//        startup = str;
//    }

    public static void main(String[] args) {

        int[] myArray = {23, 34, 21, 55, 12, 37};

        //First question.
        System.out.println("\nDifference between all numbners in comparation with first one.\n");
        for (int i = 0; i < myArray.length - 1; i++) {
            int diff = myArray[i] - myArray[i + 1];
            System.out.println(abs(diff));
        }

        //Second question
        System.out.println("\nHere you can see all the numbers that are greater than the first number.\n");
        checkFirst(myArray);

    }

    public static void checkFirst(int[] arr) {
        int first = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) System.out.println(arr[i]);
        }
    }
}
