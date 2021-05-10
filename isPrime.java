//ooh fancy code to check for prime numbers
import java.util.Scanner;

public class isPrime {  

    public static int primeTest(int number){   ///method bit
        //use modulus to test for remainders
        int testedNumber =0; 
        boolean flag = false; 

        for (int i=2; i<= number/2; i++){
            if (number %2 ==0){  //use binary flag to leave marks for any 0s
                flag = true;
                break;
            }
        }

        if (!flag){
            testedNumber = 1;
            System.out.println("Number is prime");
        }
        else {
            testedNumber = 0;
            System.out.println("number is not prime");
        }
    
        return testedNumber;
    }

    public static void main (String args[]){
        //take in an integer rom user
        int testedNumber = 0; 
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();
        input.nextLine();
        //now we have the number, lets pass to the method

        
        testedNumber = primeTest(number);




    }
    
}
