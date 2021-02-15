package dataStructures;

public class Arrays {
    public static void main(String[] args) {
        String[] alphabet = {"a", "b", "c", "d", "e", "f"};

        System.out.println("Old Fashion way");
        for (int i = 0; i <= 5; i++) {
            System.out.print(alphabet[i]);
        }

        System.out.println("\nUsing .length");
        for (int n = 0; n < alphabet.length;n++){
            System.out.print(alphabet[n]);
        }

        System.out.println("\nUsing for each loop");
        for(String letter : alphabet){
            System.out.println(letter);
        }
    }
}
