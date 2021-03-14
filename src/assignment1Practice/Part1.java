package assignment1Practice;

import static sun.swing.MenuItemLayoutHelper.max;

public class Part1 {

    public static void main(String[] args) {
        int[] myArray = {45, 13, 47, 28, 33,12,34,56,12,34,56};

        // Exercise 1.
        for (int arr : myArray) {
            System.out.println(arr + 10);
        }
        //Exercise 2. First type.
        System.out.println(max(myArray));

        //Second type
        System.out.println("_______________________________");
        System.out.println(findBig(myArray));
    }

    public static int findBig(int[] arr){
        int biggestNo = arr[0];
        int size = arr.length;

        for (int i = 1; i<size;i++){
            if (arr[i]>biggestNo) biggestNo = arr[i];
        }
        return biggestNo;
    }
}
