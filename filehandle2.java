import java.io.File;
import java.util.Scanner;
import java.io.IOException;


public class filehandle2 {
    public static void main(String args[]){
        try{
           File javafiles = new File ("filehandle.java");//javafiles--is a folder name
           if(javafiles.createNewFile()){
                System.out.println("file created :"+javafiles.getName());
           } else{
                System.out.println("file already exists.");
           } 
        }
        catch (IOException e) {
            System.out.println("file is not created .");
            e.printStackTrace();
        }
        

    }

    
    
    

    
}
