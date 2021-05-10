//ThreeAndConditions
import java.util.Scanner;

class AndCondition{
    public static void main(String[] args){
        int first;
        int second;
        int third;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number:");
        first = input.nextInt();  //now we have the value from the user

        System.out.print("Enter your second number:");
        second = input.nextInt();  //now we have the second value from the user

        System.out.print("Enter your third number:");
        third = input.nextInt();  //now we have the third value from the user

        if (first < second){
            if (third>=first && third<=second){
                System.out.println("Your number " + third + " is between the two numbers");
                input.close();
        } else if (first> second){
            System.out.println("Your number " + third + " is between the two numbers");
            input.close();
        }else {
            System.out.println("Your number " + third + " is not between the two numbers");
        }

    }
}

