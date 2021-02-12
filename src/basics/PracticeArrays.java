package basics;

import java.util.Arrays;

public class PracticeArrays {

    public static void main(String[] args) {

//        String[] cities = {"New York","San Francisco","Miami"};
//        System.out.println(cities[0]);

        // Declare the size of the array
        String[] states= new String[4];
        states[0] = "California";
        states[1] = "UTA";
        states[2] = "Texas";
        states[3] = "Virginia";


        //Do loop: enters the loop and after is testing the condition;
        System.out.println("\nPrinting with doWhile loop");
        int i = 0;
        do {
            System.out.println(states[i]);
            i++;
        }while(i < 4);

        //While loop is checking the condition first and after is executing!
        System.out.println("\nPrinting with while loop");
        int n = 0;
        boolean stateFound = false;

        while (!stateFound){
            String state = states[n];
            if (state == "Texas"){
                System.out.println("State Found!: " + states[n]);
                stateFound = true;
            }
            n++;
        }

        System.out.println("\nPrinting with for loop");
        //For Loop best for array.
        for (int x = 0;x <4 ; x++ ){
            System.out.println(states[x]);
        }

     }
}
