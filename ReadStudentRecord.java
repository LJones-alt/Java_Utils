//this will read the student records file amd display it nicely
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadStudentRecord {
    public static void main(String[] args){
        try{
            FileReader reader=new FileReader("StudentRecord.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            int i=1;

            while ((line = bufferedReader.readLine()) != null) {
                if (i==1){
                 System.out.print("Number of Students is: " + line);   
                 System.out.println();
                }
                else if (i%2 == 0) {  // all even lines will have names
                    System.out.print("Name of Student is: " + line);
                }
                else if (i%2!=0){ //iff odd line, this ia an age
                    System.out.print(" and their age is: " + line);
                    System.out.println();
                }
                i++; //count up so we dont print the same thing again
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
