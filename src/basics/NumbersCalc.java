package basics;

public class NumbersCalc {
    public static void main(String[] args) {
        printName();
        System.out.println(addNumbers(2,3));
        System.out.println(multipleNumbers(5,6));

    }


    static void printName(){
        System.out.println("My name is Vasile");
    }


    static int addNumbers(int x,int y){
        return x+y;
    }


    static int multipleNumbers(int a,int b){
        return a*b;
    }

}
