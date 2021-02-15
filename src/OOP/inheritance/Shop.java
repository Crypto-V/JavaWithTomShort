package OOP.inheritance;

public class Shop extends Building{
    private int numEmployees;
    private int averageTurnover;

    public Shop(){
        super();
        numEmployees = 0;
        averageTurnover = 0;
    }

    public Shop(String add,String own, int emp,int turn){
        super(add,own);
        numEmployees = emp;
        averageTurnover = turn;
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
