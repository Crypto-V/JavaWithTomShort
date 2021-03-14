package oop.inheritance;

public class Building {
    private String address;
    private String owner;
    private static int numBuildings = 0;

    public static int getNumBuildings(){
        return numBuildings;
    }

    public Building(){
        address = "";
        owner = "";
        numBuildings++;
    }

    public Building(String add,String own){
        address = add;
        owner = own;
        numBuildings++;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
