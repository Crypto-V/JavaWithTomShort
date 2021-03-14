package generics;


public class Printer {
    public static void main(String[] args) {
        Integer [] intArray = {1,2,3};
        String [] stringArray = {"one","two","three"};
        printArray(intArray);
        printArray(stringArray);

    }

    //Old way without generics
//    public static void printArray(Integer [] array){
//        for (int i: array){
//            System.out.println(i);
//        }
//    }
//
//    public static void printArray(String [] array){
//        for (String j:array) {
//            System.out.println(j);
//        }
//    }

    //Using generics!
    public static <T> void printArray(T[] arr){
        for (T elemnet:arr) {
            System.out.println(elemnet);
        }
    }
}
