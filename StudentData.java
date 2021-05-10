//studentInfo

import java.util.Scanner;

class StudentData{
    public static void main(String[] args){

        //create arrays
        String[] names = new String[3];
        int[] ages = new int[3];


        //get first student data
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first student name:");
        names[0] = input.nextLine();
        System.out.println("Enter first student age:");
        ages[0] = input.nextInt();
        input.nextLine();

        //second student data
        System.out.print("Enter second student name:");
        names[1] = input.nextLine();
        System.out.print("Enter second student age:");
        ages[1] = input.nextInt();
        input.nextLine();

        //third student data
        System.out.print("Enter third student name:");
        names[2] = input.nextLine();
        System.out.print("Enter third student age:");
        ages[2] = input.nextInt();
        input.nextLine();

        //now display in reverse order!
        for (int i=2; i>-1; i--){
            System.out.println(names[i] + " Age: " + ages[i]);
        }

        input.close();
    }
}