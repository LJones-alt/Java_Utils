import java.lang.reflect.Array;
import java.util.Random;

public class FindFive {
    public static int[] getRandom(int[] array){
        //make some variables
        int size = array.length;  //double check the size
        int[] randomArray = new int[size];

        Random rand = new Random();

        for (int i = 0; i < size; i++){
            randomArray[i] = rand.nextInt(21);
        }
        
        
        return randomArray;

    }

    public static int getFives(int[] randomArray){
        int size = randomArray.length;
        int numberFives = 0;

        for (int i = 0; i < size; i++){  //cycle through the elements
            int test_var = randomArray[i];
            

            if (test_var ==5){  //does the element equal 5?
                numberFives = numberFives + 1;
            }
        }


        return numberFives;
    }


    public static void main (String args[]){
        int[] array = new int[100];  //100 element array
        int[] randomArray = new int[100]; //also 100 elements
        int numberFives = 0;

        randomArray = getRandom(array);  //make them random
        for (int i = 0; i < 100; i++){
            System.out.print(randomArray[i]);
        }
        
        
        numberFives = getFives(randomArray);  //find the number of fives

        System.out.println("number of 5s: " + numberFives);



    }
    
}
