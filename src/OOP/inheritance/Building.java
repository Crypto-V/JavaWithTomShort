package OOP.inheritance;

public class Building {
    private String address;
    private String owner;

    public Building(){
        address = "";
        owner = "";
    }

    public Building(String add,String own){
        address = add;
        owner = own;
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
