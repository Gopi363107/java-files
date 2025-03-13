import java.io.FileWriter;
import java.io.IOException;
public class filehandle3 {

    public static void main(String args[]){
        try{
            FileWriter mywriter = new FileWriter("filehandle4.java");
            mywriter.write("File in java might be tricky it is hard to handle these files so you first study all basics..");
            mywriter.close();
            System.out.println("Successfully wrote to the file..");
        }
        catch (IOException e){
            System.out.println("error occured..");
            e.printStackTrace();
        }

    }
    
}
