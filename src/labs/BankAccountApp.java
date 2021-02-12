package labs;

public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("4563229874", 1000);
        BankAccount acc2 = new BankAccount("5151672334", 2000);
        BankAccount acc3 = new BankAccount("6906311332", 3000);

        acc1.setName("Jim Carey");
        System.out.println(acc1.getName());

        acc1.makeDeposit(500);
        acc1.makeDeposit(600);
        acc1.payBill(1000);
        acc1.accrue();
        System.out.println(acc1.toString());
    }
}

class BankAccount implements IInterest {
    //Properties of a bank account.
    private static int iD = 1000; //Internal ID
    private String accountNumber; // id+random 2-digit number+first 2 of ssn.
    private static final String routingNumber = "005400657";
    private String name;
    private String ssn;
    private double balance;

    //Constructors
    public BankAccount(String ssn, double initDeposit) {
        balance = initDeposit;
        System.out.println("New account created!");
        this.ssn = ssn;
        iD++;
        setAccountNumber();

    }

    private void setAccountNumber() {
        int random = (int) (Math.random() * 100);
        accountNumber = iD + "" + random + ssn.substring(0, 2);
        System.out.println(accountNumber);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void payBill(double amount) {
        balance = balance - amount;
        System.out.println("Paying bill: " + amount);
        showBalance();
    }

    public void makeDeposit(double amount) {
        balance = balance + amount;
        System.out.println("Making deposit: " + amount);
        showBalance();
    }

    public void showBalance() {
        System.out.println("Balance: " + balance);
    }


    @Override
    public void accrue() {
        balance = balance * (1 + rate/100);
        showBalance();
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                ", balance=" + balance +
                '}';
    }
}
