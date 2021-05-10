//PayCalc

import java.util.Scanner;

class PayCalc{
    public static void main(String[] args){
        double hours;
        double payRate;
        double extra;
        double max_hours = 40;
        double payment = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of hours:");
        hours = input.nextInt();  //now we have the number of hours worked 

    
        System.out.print("Enter rate of pay:");
        payRate = input.nextInt();  //now we have the pay grade

   // calulate payment
        if (hours <= 0 || hours>=60){
            System.out.println("Hours is out of expected range, try again");
        } else if (hours >=40){
            extra= hours-40; //only change if more than 40 hours
            payment = max_hours * payRate + (extra * payRate * 1.5); //account for extra
        } else if (hours < 40){
            payment = hours * payRate; //normal case
        }

        System.out.print("You will be paid £" + payment);
    }
}




