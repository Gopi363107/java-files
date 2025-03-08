import java.io.*;
import java.lang.System;
import java.util.Scanner;

public class sys{
    public static void main(String args[]){
        //get input from the user in celsius
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the temperature in celsius :");
        float temp=sc.nextFloat();

        //conver celsius into farenheit
        temp = (((temp-32)*5)/9);

        //print the temperature in farenheit
        System.out.println("the temperature in ferenheit : "+temp);

    }
}