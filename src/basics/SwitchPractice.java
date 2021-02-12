package basics;

public class SwitchPractice {
    public static void main(String[] args) {
        //This program will give the suggestion based on the temperature.

        String dayOfWeek = "Tuesday";

        switch(dayOfWeek){
            case "Monday":
                System.out.println("This is Monday");
                break;
            case "Tuesdays":
                System.out.println("This is Tuesday");
                break;
            case "Wednesday":
                System.out.println("This is Wednesday");
                break;
            case "Thursday":
                System.out.println("This is Thursday");
                break;
            default:
                System.out.println("This is default");
        }

    }
}
