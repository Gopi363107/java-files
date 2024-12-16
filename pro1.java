//program for convert farenhit to celsius
import java.util.Scanner;
import java.io.*;
public class pro1 {
    public static void main(String args[]){
        //get input from the user in float
        float temperature;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an temperature in farenhit :");
        temperature=sc.nextFloat();
        
        //formula for convert farenhit into celsius
        temperature=(((temperature-32)*5)/9);

        System.out.println("temperature in celsius : "+temperature);

        

    }
    
}
