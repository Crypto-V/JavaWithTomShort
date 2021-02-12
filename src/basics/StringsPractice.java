package basics;

public class StringsPractice {
    public static void main(String[] args) {
        String bookTittle;
        bookTittle = "The lord of the rings";

        if(bookTittle.contains("ring")){
            System.out.println(true+" this tittle contains the required word!");
        }

        String browser = "Chrome";
        if(browser.equals("Chrome")){
            System.out.println("\nThe browser is chrome!");
        }

        String firstName = "Vasile";
        String lastName = "Verejan";
        String SSN = "84151511";

        //Print the initials plus last 4 digits of social security number!

        String x = firstName.substring(0,1);
        String y = lastName.substring(0,3);
        String z = SSN.substring(5);
        System.out.println("The password is: "+x+y+z);


    }
}
