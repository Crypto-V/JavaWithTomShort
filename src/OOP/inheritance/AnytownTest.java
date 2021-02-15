package OOP.inheritance;

public class AnytownTest {
    public static void main(String[] args) {

        House h1 = new House();
        House h2 = new House("12 Main Street ","Roy Cooper",3,true);
        h1.setAddress("31 August");
        h1.setHasGarage(false);
        h1.setOwner("Verejan Vasile");
        h1.setNumBedrooms(5);
        System.out.println(h1);
        System.out.println(h2);
        h2.setNumBedrooms(4);
        System.out.println(h2);

        Shop sh1 = new Shop();
        Shop sh2 = new Shop("5 rubbery street","George Mcdonald",50,250000);
        sh1.setOwner("Bucket");
        sh1.setAddress("Bucklet 34");
        sh1.setAverageTurnover(15000);
        sh1.setNumEmployees(25);
        System.out.println(sh1);
        System.out.println(sh2);
        sh2.setNumEmployees(13);
        System.out.println(sh2);

        //Key concepts
        // Iheritance- sharing attributes and methods between classes arranged in a hierarchy
        //Polymorphism
    }
}
