//tyoing up example
import java.util.Scanner;

public class errorHandling {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("please enter an integer: ");
            int number = input.nextInt();

        }catch(Exception e){
            System.out.println("The value given was not an integer");
        }
    }
}
