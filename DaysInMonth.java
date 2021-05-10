//DaysInMonth

import java.util.Scanner;

class DaysInMonth {
    public static void main(String[] args){
        int month;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        month = input.nextInt();


        switch (month){
            case 1:
            System.out.println("31");
            break;
            case 2:
            System.out.println("28 (unless it's a leap year, then 29)");
            break;
            case 3:
            System.out.println("31");
            break;
            case 4:
            System.out.println("30");
            break;
            case 5:
            System.out.println("31");
            break;
            case 6:
            System.out.println("30");
            break;
            case 7:
            System.out.println("31");
            break;
            case 8:
            System.out.println("31");
            break;
            case 9:
            System.out.println("30");
            break;
            case 10:
            System.out.println("31");
            break;
            case 11:
            System.out.println("30");
            break;
            case 12:
            System.out.println("31");
            break;
            default:
            System.out.println("That is not a month, try again");

        }
        input.close();
    }

}