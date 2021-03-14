package oop.pet;

import java.util.Random;
import java.util.Scanner;

public class PetApp {

    private static int getRandomValue() {
        Random random = new Random();
        return random.nextInt(20 - 1) + 1;
    }

    public static void main(String[] args) {

        String[] randomDogArray = {"Regular", "Shepherd", "Husky"};
        String[] randomCatArray = {"Regular", "Black", "Persian"};
        Scanner input = new Scanner(System.in);
        int catCounter = 0;
        int dogCounter = 0;

        PetBP[] pets = new PetBP[5];
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int age = getRandomValue();
            int randomIndex = random.nextInt(3);
            System.out.println("What would you like to add in the list Cat or Dog?");
            String choice = input.next();

            if (choice.equals("Dog")) {
                pets[i] = new Dog(" ", age, randomDogArray[randomIndex]);
                System.out.println("Dog created!");
                dogCounter++;
            } else {
                pets[i] = new Cat(" ", age, randomCatArray[randomIndex]);
                System.out.println("Cat created!");
                catCounter++;
            }
        }


        System.out.println("\nOk so our list is full now is time to name the pet!");
        System.out.println("In total we have created " + dogCounter + " dogs and " + catCounter + " cats.");
        String petName;

        for (int i = 0; i < 5; i++) {
            System.out.println(pets[i]);
            System.out.println("How would you like to name this pet? ");
            petName = input.next();
            if (petName.equals("Exit")) {
                break;
            } else {
                pets[i].setName(petName);
                System.out.println("Updated");
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(pets[i].speak());

        }
    }
}
