package oop.inheritance;

public class House extends Building{
    private int numBedrooms;
    private boolean hasGarage;
    private static int numHouses = 0;

    public static int getNumHouses(){
        return numHouses;
    }

    public House(){
        numBedrooms = 0;
        hasGarage = false;
        numHouses++;
    }

    public House(String add,String own,int beds,boolean garage){
        super(add,own);
        numBedrooms = beds;
        hasGarage = garage;
        numHouses++;
    }

    public int getNumBedrooms() {
        return numBedrooms;
    }

    public void setNumBedrooms(int numBedrooms) {
        this.numBedrooms = numBedrooms;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }


    public String toString() {
        String str = "The house at " + super.toString();
        str += " has "+numBedrooms+ " bedrooms and ";
        if (hasGarage) str += "a garage";
        else str += "no garage";
        return str;
    }
}
