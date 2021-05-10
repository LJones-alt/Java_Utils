 import java.util.Random;

 public class random_number{
     public static void main (String args[]){
         Random rand = new Random();

         int randomInteger = rand.nextInt(10);
         System.out.println("Random number: " + randomInteger);

         double randomDouble = rand.nextDouble();
         System.out.println("Random doubles: " + randomDouble);

     }
 }