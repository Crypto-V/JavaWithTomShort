package OOP;

public class CDAccount extends BankAccount implements IRate{
    String interestRate;

    void compound(){
        System.out.println("Compounding the result");
    }
}
