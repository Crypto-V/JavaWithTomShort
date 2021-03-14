package oop.inheritance;

public class Shop extends Building{
    private int numEmployees;
    private int averageTurnover;
    private static int numShops = 0;

    public static int getNumShops(){
        return numShops;
    }

    public Shop(){
        super();
        numEmployees = 0;
        averageTurnover = 0;
        numShops++;
    }

    public Shop(String add,String own, int emp,int turn){
        super(add,own);
        numEmployees = emp;
        averageTurnover = turn;
        numShops++;
    }

    public int getNumEmployees() {
        return numEmployees;
    }

    public void setNumEmployees(int numEmployees) {
        this.numEmployees = numEmployees;
    }

    public int getAverageTurnover() {
        return averageTurnover;
    }

    public void setAverageTurnover(int averageTurnover) {
        this.averageTurnover = averageTurnover;
    }


    public String toString() {
        return "The Shop at"+super.toString() +
                "has numEmployees =" + numEmployees +
                " and  averageTurnover=" + averageTurnover +
                '.';
    }
}
