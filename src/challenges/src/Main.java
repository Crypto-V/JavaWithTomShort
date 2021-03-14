package challenges.src;

public class Main {

    private int[] myArray = { 23, 34, 21, 55, 12, 37};
    private int startup;

    //default constructor
    public Main(){
        startup = 1;
    }

    public Main(int str){
        startup = str;
    }


    public static void main(String[] args){

        int[] myArray = { 23, 34, 21, 55, 12, 37};
        int[] myArray2 = { 23, 34, 21, 55, 12, 37};
        char[] temp = { 'X', 'P', 'A', 'N', 'D'};

        int first = myArray[0];
        for(int i = 0; i < myArray.length; i++)
        {
            int diff = first - myArray[i];
            if (diff < 0)
            {
                diff = diff * -1;
            }
            myArray[i] = diff;
            System.out.println(diff);
        }

        for(int i = 0; i < myArray.length; i++)
        {
            System.out.println(myArray[i]);
        }

        System.out.println("Question 2");
        for(int i = 0; i < myArray2.length; i++)
        {
            if (myArray2[i] > myArray2[0])
            {
                System.out.println(myArray2[i]);
            }
        }

        System.out.println("Question 3");
        System.out.print("START: \t");
        System.out.println(temp[1] + "*" + temp[2] + "*" + temp[3]);
        // P*A*N

        testArray(temp);

        System.out.print("END: \t");

        System.out.println(temp[1] + "*" + temp[2] + "*" + temp[3]);
        // P*U*T
    }

    public static void testArray(char[] myLetter)
    {
        myLetter[2] = 'U';
        myLetter[3] = 'T';
        myLetter[4] = 'Q';
    }
}
