//SwitchStatement

import java.util.Scanner;

class SwitchStatement {
    public static void main(String[] args){
        int day;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        day = input.nextInt();


        switch (day){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
            default:
            System.out.println("That is not a day of the week, try again");

        }
        input.close();
    }

}