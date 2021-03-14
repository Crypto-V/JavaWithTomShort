package challenges.src;

public class CarTest {

    public CarTest() {

    }

    public static void main(String[] args) {
        //Create 2 car objects
        Car car1 = new Car();
        Car car2 = new Car("Toyota", "Black");
        Car car3 = new Car("Fiat", "Red");
        Car car4 = new Car("Ford", "White");

        car1.SetName("BMW");
        car1.setColour("White");

        System.out.println("Car1: " + car1.ToString());
        System.out.println("Car2: " + car2.ToString());

        MyCars collection = new MyCars();

        if (!collection.addNewCar(car1)) {
            System.out.println("Car not added to collection");
        }
        if (!collection.addNewCar(car2)) {
            System.out.println("Car not added to collection");
        }
        if (!collection.addNewCar(car3)) {
            System.out.println("Car not added to collection");
        }
        if (!collection.addNewCar(car4)) {
            System.out.println("Car not added to collection");
        }

        collection.showMyCars();

        String clr = collection.getColour("BMW");
        System.out.println("Colour of BMW: " + clr);

        clr = collection.getColour("Ford");
        System.out.println("Colour of Ford: " + clr);

        Car car5 = new Car("BMW", "Blue");
        Car car6 = new Car("Mercedes", "Blue");

        if (!collection.changeColour(car5)) {
            System.out.println("Car not found: Colour not updated");
        }

        if (!collection.changeColour(car6)) {
            System.out.println("Car not found: Colour not updated");
        }

        collection.showMyCars();

        if (!collection.delete("Honda")) {
            System.out.println("Honda was not deleted. Not found in collection!");
        }

        if (!collection.delete("BMW")) {
            System.out.println("BMW was not deleted");

        }

        collection.showMyCars();
        collection.addNewCar(car4);
        collection.showMyCars();
        System.out.println(collection.alphabeticallyLast());
        System.out.println("\nThis is the actual object full name: " + collection.getObjByName(collection.alphabeticallyLast()));


    }
}
