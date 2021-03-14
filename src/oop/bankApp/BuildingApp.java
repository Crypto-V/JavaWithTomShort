package oop.bankApp;

public class BuildingApp {
    public static void main(String[] args) {

        Building bd1 = new Building();
        Building bd2 = new Building("3 high street","Vasile verejan");
        Building bd3 = new Building();

        bd1.setAddress("31 august 55");
        bd1.getAddress();
        bd3.setAddress("20 fagfa agaga");
        System.out.println(bd1.toString());
        System.out.println(bd2.toString());
        System.out.println(bd3.toString());

    }
}
