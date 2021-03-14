package oop.inheritance;
import java.util.Random;
import java.util.Scanner;

public class AnytownTest {

    private static int getRandomValue(int low,int high){
        Random random = new Random();
        return random.nextInt(high-low)+low;
    }


    public static void main(String[] args) {

//        House h1 = new House();
//        House h2 = new House("12 Main Street ","Roy Cooper",3,true);
//        h1.setAddress("31 August");
//        h1.setHasGarage(false);
//        h1.setOwner("Verejan Vasile");
//        h1.setNumBedrooms(5);
//        System.out.println(h1);
//        System.out.println(h2);
//        h2.setNumBedrooms(4);
//        System.out.println(h2);
//
//        Shop sh1 = new Shop();
//        Shop sh2 = new Shop("5 rubbery street","George Mcdonald",50,250000);
//        sh1.setOwner("Bucket");
//        sh1.setAddress("Bucklet 34");
//        sh1.setAverageTurnover(15000);
//        sh1.setNumEmployees(25);
//        System.out.println(sh1);
//        System.out.println(sh2);
//        sh2.setNumEmployees(13);
//        System.out.println(sh2);
//
//        System.out.println("\nThere are a total of "+
//                    Building.getNumBuildings()+" of which "+
//                    House.getNumHouses()+" houses and "+
//                    Shop.getNumShops()+" shops.");

        //Key concepts
        // Iheritance- sharing attributes and methods between classes arranged in a hierarchy
        //Polymorphism

        Building[] buildings = new Building[10];
        Scanner input = new Scanner(System.in);
        String address;
        int numBeds;
        boolean garage;
        String owner;
        for (int i = 0; i < 5; i++) {
            address = "" + (31 + i) + " Main Street";
            numBeds = getRandomValue(1,5);
            garage=(getRandomValue(1,100)<50);
            System.out.println("Enter the name of the owner");
            owner = input.next();
            buildings[i] = new House(address, owner, numBeds, garage);
        }

        int turnover,employees;
        for (int i = 5; i < 10; i++) {
            address = ""+i+" Main street";
            turnover = getRandomValue(10000,1000000);
            employees = getRandomValue(5,50);
            System.out.println("Enter the name of the owner");
            owner = input.next();
            buildings[i] = new Shop(address,owner,employees,turnover);
        }

        for(int i = 0; i<10; i++){
            System.out.println(buildings[i]);
        }
    }
}
