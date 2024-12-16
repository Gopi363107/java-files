import java.util.Scanner;
import java.io.*;
import java.lang.System;

public class line{
     public static void main(String args []){
        System.out.println("enter number of element in an array : ");

        int n ;
        Scanner sc=new Scanner(System.in);

        //get input from the user number of element in an array
        n=sc.nextInt();

        //get array elements 
        System.out.println("enter array element : ");
        int[] c=new int[n];

        for(int i=0;i<n;i++){

            c[i]=sc.nextInt();
        }

        int s=c[0];

        //using for loop and if condition find the minimum element in an array
        for(int j=0;j<n;j++){
            if(s>c[j]){
                s=c[j];
            }
        }
        System.out.println("your minimum element in an array is "+s);

     }
}