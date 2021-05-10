//libaries
import java.util.Scanner;
import java.util.Random;

public class diceRoll {
    public static void main (String args[]){

        int dice_rolls = 0; 
        //these hold the number of times the number is rolled
        int ones = 0;
        int twos = 0;
        int threes = 0;
        int fours = 0;
        int fives = 0;
        int sixes = 0;
        int score = 0; //test variable for dice

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("please enter number of dice rolls: ");
        dice_rolls = input.nextInt();
        input.nextLine();

        //int[] scores = new int[dice_rolls-1];
        //lets do the dice rolls
        for (int i = 0; i < dice_rolls+1; i++){
            score = rand.nextInt(6) +1;

            if (score ==0){
                ones = ones +1;
            }
            else if (score ==1){
                twos = twos +1;
            }
            else if (score ==3){
                threes = threes + 1;
            }
            else if (score ==4){
                fours = fours +1;
            }
            else if (score ==5){
                fives = fives+1;
            }
            else if (score ==6){
                sixes = sixes +1;
            }
        }

        //now do the print statements
        System.out.println("");
        System.out.print("1: ");
        for (int i = 0; i < ones +1; i++){
            System.out.print("|");
        }
        System.out.println("");

        System.out.print("2: ");
        for (int i = 0; i < twos +1; i++){
            System.out.print("|");
        }
        System.out.println("");
        System.out.print("3: ");
        for (int i = 0; i < threes +1; i++){
            System.out.print("|");
        }
        System.out.println("");
        System.out.print("4: ");
        for (int i = 0; i < fours +1; i++){
            System.out.print("|");
        }
        System.out.println("");
        System.out.print("5: ");
        for (int i = 0; i < fives +1; i++){
            System.out.print("|");
        }
        System.out.println("");
        System.out.print("6: ");
        for (int i = 0; i < sixes +1; i++){
            System.out.print("|");
        }
        // why so many print statements? why not???
    }
    
}
