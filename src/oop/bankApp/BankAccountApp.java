package oop.bankApp;

public class BankAccountApp {
    public static void main(String[] args) {
        //Creating a new bank account!
        BankAccount acc1 = new BankAccount();

        //Seting anme using encapsulation.Public API methods.
        acc1.setName("Roger Hue");
        System.out.println(acc1.getName());

        acc1.setSsn("870-3454-123");
        System.out.println(acc1.getSsn());

        acc1.accountNumber = "01231314";
        acc1.Balance = 2000;
        acc1.setRate();
        acc1.increaseRate();
        acc1.deposit(120);
        acc1.withdraw(2000);

        //Polymorphism through overriding
        System.out.println(acc1.toString());


        //Polymorphism through overloading
        BankAccount acc2 = new BankAccount("Checking Account!");
        acc2.accountNumber = "01231112314";

        BankAccount acc3 = new BankAccount("Saving account",132.21);
        acc3.accountNumber = "01231342114";
        acc3.checkBalance();

//        //Demo for inheritance
//        CDAccount cd1 = new CDAccount();
//        cd1.interestRate = "4,5";
//        cd1.accountNumber = "3000";
//        cd1.name = "Cd1 name";
//        cd1.accType = "Cd Account";
//        System.out.println(cd1.toString());
//        cd1.compound();


    }
}
