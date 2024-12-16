//add two numbers in java
import java.util.Scanner;
import java.io.*;

public class add {
    public static void main(String args []){
        //assign variables
        int x,y,z;
        //get input from the user
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value x:");
        x=sc.nextInt();
        System.out.println("enter value y:");
        y=sc.nextInt();

        //add the values using third variable
        z=x+y;

        //print the values after adding
        System.out.println("your value of z : "+z);

    }    
}
