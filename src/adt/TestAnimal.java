package adt;

public class TestAnimal {
    public static void main(String[] args) {

        Lion myLion1 = new Lion();
        Lion myLion2 = new Lion("George",10,"Meet",13);

        myLion1.setAge(3);
        System.out.println(myLion1);
        System.out.println();
        System.out.println(myLion2);

        System.out.println(Lion.numOfLions());

    }
}
