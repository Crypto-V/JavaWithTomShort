package recursion;

public class Rec1 {
    public static void main(String[] args) {
        RecPractise(10, 30);

    }

    public static void RecPractise(int integer1, int integer2) {
        System.out.println(integer1);
        //Base case
        if (integer1 < integer2) {
            //Recursive call.
            RecPractise(integer1 + 1, integer2);
        }
    }
}
