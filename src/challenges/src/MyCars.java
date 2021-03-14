package challenges.src;

import java.util.Arrays;

public class MyCars extends Car {

    private Car[] cars = new Car[3];
    private int carCount = 0;

    //default constructor
    public MyCars() {
        super();
        for (int i = 0; i < cars.length; i++) {
            Car car = new Car();
            cars[i] = car;
        }
        //carCount = 3;
    }

    //overload constructor
    public MyCars(String n, String c) {
        super(n, c);
        carCount++;
    }

    public void showMyCars() {
        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            if (!car.getName().equals("")) {
                System.out.println(car.ToString());
            }
        }
    }

    public boolean addNewCar(Car newCar) {
        boolean caradded = true;
            //Check for duplicates
        if (carCount < 3) {

            // carCount (0, 1, 2, 3)
            for (int i = 0; i < cars.length; i++) {
                if (cars[i].getName().equals("")) {
                    carCount++;
                    cars[i] = newCar;
                    break;
                }
            }

            //cars[0, 1, 2]
        } else // hit the capacity. Cant have more than 3 cars
        {
            caradded = false;
        }

        return caradded;
    }

    public String getColour(String n) {
        String desc = "";

        for (int i = 0; i < cars.length; i++) {
            Car cr = cars[i];
            if (cr.getName().equals(n)) {
                desc = cr.getColour();
            }
        }
        return desc;
    }

    public boolean changeColour(Car car) {
        boolean colourchanged = false;

        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getName().equals(car.getName())) {
                cars[i].setColour(car.getColour());
                colourchanged = true;
            }
        }

        return colourchanged;
    }


    public boolean delete(String n) {
        boolean deleted = false;

        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getName().equals(n)) {
                cars[i].SetName("");
                cars[i].setColour("");
                deleted = true;
                carCount--;
            }
        }
        return deleted;
    }

    public String alphabeticallyLast() {
        String name = "";
        boolean arrayEmpty = true;

        //Check for no-empty cars

        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getName() != "") {
                arrayEmpty = false;
            }
        }
        //if no empty cars than sort the array
        if (!arrayEmpty) {
            String[] carnames = new String[3];

            for (int i = 0; i < cars.length; i++) {
                carnames[i] = cars[i].getName();
            }

            Arrays.sort(carnames);
            name = carnames[carnames.length - 1];
        }
        return name;
    }

    public String getObjByName(String name) {
        Car foundedCar = new Car();
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getName().equals(name)) {
                foundedCar = cars[i];
            }
        }
        return foundedCar.ToString();

    }

}
