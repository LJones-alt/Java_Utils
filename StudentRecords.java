import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Arrays;

public class StudentRecords {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int numberStudents = 0;
        //get number of students from user (assume idiots)
        try {
            System.out.println("please enter number of students (eg. 3) : ");
            numberStudents = input.nextInt();
            input.nextLine();
            } catch (Exception e){
                e.printStackTrace();
            }
        //now we know the number of students, lets collect names and ages
        String[] names = new String[numberStudents];
        int[] ages = new int[numberStudents];

        //error handling for age
        boolean ageCheck = false;

        for (int i = 0; i < numberStudents; i++){
            do {
                try {
                    System.out.println("Please enter student " + (i+1) + " name: ");
                    names[i] = input.nextLine();

                } catch (Exception e){
                    e.printStackTrace();
    
                }
    
                try {
                    System.out.println("Please enter student " + (i+1) + " age: ");
                    ages[i] = input.nextInt();
                    input.nextLine(); //because int collected

                    //reasonable age?
                    if (ages[i]>0 && ages[i]<100){
                        ageCheck=true;
                    }
                    else{
                        System.out.println("Are you sure? Check " + names[i] +" age and try again");
                    }

                } catch (Exception e){
                    e.printStackTrace();
                }
            } while (ageCheck == false);

        }
        //now write the file
        try{
            FileWriter writer = new FileWriter("StudentRecord.txt", true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(Integer.toString(numberStudents));
            bufferWriter.newLine();
            
                //looooop
            for (int i = 0; i < numberStudents; i++){
                try{ //now loop to write the file
                    bufferWriter.write(names[i]);
                    bufferWriter.newLine();
                    bufferWriter.write(Integer.toString(ages[i]));
                    bufferWriter.newLine();
                }
                catch (IOException e){
                e.printStackTrace();
                }
    
            }
            bufferWriter.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.printf("names : %s",  Arrays.toString(names));
        System.out.printf("names : %s",  Arrays.toString(ages));
    }
     




    
}


