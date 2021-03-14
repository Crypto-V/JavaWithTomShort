package oop.bankApp;

public class BankAccount implements IRate{
    //Define variables,class attributes.
    String accountNumber;

    //Static belong to the class not to the obj instance.
    //final >> constant,can't be changed.
    private static final String routingNumber = "0124151";

    //Instance variables
    private String name;
    private String ssn;
    String accType;
    double Balance = 0;

    //Constructor definitions!
        //1. Used to define or setup or initialize properties of an obj.
        //2. Constructors are implicitly call when creating a new instance.
        //3. The same name as the class itself.
        //4. No return type

    BankAccount(){
        System.out.println("New acc Created! ");
    }

    //Overloading: call the same method name with different arguments
    BankAccount(String accType){
        System.out.println("New obj with arguments created!");
        System.out.println("Account type is: "+ accType);
    }

    BankAccount(String accType,double initDeposit){
        //initDeposit, accType and Msg are all local variables.
        System.out.println("New obj with arguments created!");
        System.out.println("Account type is: "+ accType);
        System.out.println("Initial deposit of: " + initDeposit);
        String Msg = null;

        if(initDeposit<10){
            Msg = "Error: Minimum deposit must be at least 1000";

        }else{
            Msg = "Thanks for initial deposit of: "+initDeposit;
        }
        System.out.println(Msg);
        Balance += initDeposit;
    }

    //Getters and Setters
    //Allow the user to define the name
    public void setName(String name){
        this.name = "Mr "+name;
    }

    public String getName(){
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    //Our interface methods
    public void setRate(){
        System.out.println("Setting the rate");
    }
    public void increaseRate(){
        System.out.println("Increasing the rate");
    }


    //Define Methods!
    void deposit(double amount){
        Balance = Balance + amount;
        showActivity("Deposit");
    }

    void withdraw(double amount){
        Balance = Balance - amount;
        showActivity("Deposit");
    }

    private void showActivity(String activity){
        System.out.println("Your recent transaction: "+ activity);
        System.out.println("Your new balance is: "+ Balance);
    }

    void checkBalance(){
        System.out.println("Your Balance is : "+ Balance );
    }

    void getStatus(){

    }

    public String toString(){
        return "[ Name: " + name +",\n" +
                " Account Number: "+ accountNumber+",\n" +
                " Routing #: "+routingNumber +",\n" +
                " Balance: $" +Balance+"]";

    }
}
