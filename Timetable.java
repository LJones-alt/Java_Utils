//Timetable
import java.util.Scanner;


class Timetable{
    public static void main(String[] args){

        String[][] lessons = {{"Maths", "Business", "Computing", "Electronics", "Maths"}
                                ,{"Business", "Business", "Electronics","Maths","Business"}
                                , {"Lunch","Lunch", "Lunch","Lunch", "Lunch"}
                                ,{"Computing", "Electronics", "Maths", "Computing", "Computing"}
                            }; //decalre matrix
        
                            Scanner input = new Scanner(System.in);
                            //ask user which day they want to know about
                            System.out.print("Which day would you like to look at (0=monday, 1= tuesday ect)");
                            int day = input.nextInt();
                            input.nextLine();

                            //ask user which lesson they want to know about
                            System.out.print("Which lesson would you like to know");
                            int lesson= input.nextInt();
                            input.nextLine();

                            //print result
                            System.out.print("The" + lesson + " lesson on day " + day + " is " + lessons[lesson-1][day]);

                            input.close();


    }
}