package labs;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        //Create a student
        Student stu1 = new Student("John","3216758949");


        stu1.enroll("History");
        stu1.enroll("Math");
        stu1.enroll("Art");
        stu1.enroll("Computing");

        stu1.showCourses();
        stu1.checkBalance();
        stu1.payTuition(600);
        stu1.checkBalance();
        System.out.println(stu1.toString());
        String x =  stu1.getEmail();
        System.out.println(x);

        stu1.setCity("Newport News");
        stu1.setPhone("+71311151414");
        stu1.setState("VA");

        String city = stu1.getCity();
        System.out.println(city);
        String state = stu1.getState();
        System.out.println(state);
        String phoneNO = stu1.getPhone();
        System.out.println(phoneNO);

    }
}

class Student{
    //Properties
    private static int iD = 1000;
    private String name;
    private String ssn;
    private String email;
    private String phone;
    private String city;
    private String state;
    public String courses = "";
    private static final int costOfCourse = 800 ;
    private int balance;

    //Constructor

    public Student(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
        iD++;
        setUserID();
        setEmail();
    }
    private void setEmail(){
        email = name.toLowerCase()+"."+iD+"@ulster.ac.uk";
        System.out.println("Your email is: "+email);
    }

    public String getEmail(){
        return email;
    }

    private void setUserID(){
        int max = 9000;
        int min = 1000;
        int randNum = (int) (Math.random() * (max-min));
        randNum = randNum + min;
        String userID = iD + "" + randNum + ssn.substring(5);
        System.out.println("Your user id is: "+ userID);

    }

    public void enroll(String course){
        courses = courses + "\n"+course;
        balance = balance + costOfCourse;
    }

    public void payTuition(int amount){
        balance = balance - amount;
        System.out.println("\nYou paid: "+amount);
    }

    public void checkBalance(){
        System.out.println("\nYour balance is: "+balance);
    }

    public void showCourses(){
        System.out.println("\nYou are enrolled in: " + courses);
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "\nname='" + name + '\'' +
                ",\ncourses='" + courses + '\'' +
                ",\nbalance=" + balance +
                '}';
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}




























































