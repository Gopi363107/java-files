import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class filehandle1{
    public static void main(String args[]){
        try{
        File gopi = new File("pattern9.java");
        Scanner myReader = new Scanner(gopi);
        while(myReader.hasNextLine()){
            String data = myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();
        
        }  
        
        catch (FileNotFoundException e){
            System.out.println("An error occured .");
            e.printStackTrace();
        }

    }
}