//error catching ages


import java.util.Scanner;

public class ageErrors {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int complete = 0;

        while (complete ==0 ){ 
            try{
                System.out.println("please enter your age: ");
                int age = input.nextInt();
                input.nextLine();
                complete = 1; 
            }
            catch(Exception e){
                input.nextLine();
                System.out.println("The value given was not an integer");
            }

        
        }

    }
}
