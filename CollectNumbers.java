//CollectNumbers
import java.util.Scanner;

class CollectNumbers{

    public static void main(String[] args){

        int numberOfIntegers;
        int number;
        int total = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        numberOfIntegers= input.nextInt();

        for (int i = 0; i < numberOfIntegers; i++) {
            System.out.print("Enter a number: ");
            number= input.nextInt();
            total= total+ number;
        }

        int average = total/numberOfIntegers;
        System.out.print("The average of all the numbers is" + average);

    }
}