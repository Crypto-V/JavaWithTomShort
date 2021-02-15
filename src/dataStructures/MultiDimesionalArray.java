package dataStructures;

public class MultiDimesionalArray {
    public static void main(String[] args) {
        String[][] users = {
                {"John", "Williams", "jw@gmail.com", "15621346"},
                {"Sarah", "Vasile", "Peter@gmail.com", "1562168586"},
                {"Rachel", "Wallace", "rc@gmail.com", "79821346"}
        };

        //Get the size of the array
        int numOfUsers = users.length;
        int numOfFields = users[0].length;
        System.out.println("Number of users " + numOfUsers);
        System.out.println("Number of fields " + numOfFields);

        //Traversing double array
        System.out.println("\nOld fashen way:");
        for (int i = 0; i < numOfUsers; i++) {
            for (int j = 0; j < numOfFields; j++) {
                System.out.println(users[i][j]);
            }
        }

        System.out.println("Using for each loop");
        for (String[] user : users) {
            System.out.print("[ ");
            for (String field : user) {
                System.out.print(field + " ");
            }
            System.out.println(" ]");
        }
    }
}
