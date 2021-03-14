package challenges.src;

public class Car {

    private String name;
    private String colour;

    //default constructor
    public Car() {
        name = "";
        colour = "";
    }

    //overload constructor
    public Car(String n, String c) {
        name = n;
        colour = c;
    }

    public void SetName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setColour(String c) {
        colour = c;
    }

    public String getColour() {
        return colour;
    }

    public String ToString() {
        String desc;

        desc = "A " + getColour() + " " + getName();

        return desc;
    }
}
