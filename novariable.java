import java.util.Scanner;
import java.io.*;
public class novariable {
    public static void main(String args[]){
        //get input from the user
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value x:");
        int x=sc.nextInt();
        System.out.println("enter value y:");
        int y=sc.nextInt();

        //print before swapping the values
        System.out.println("before swapping value of x and y :"+x+" "+y);

        //swapping the values without using third variable
        x=x+y;  //x=5 y=10 x=15
        y=x-y;  //y=15-10=5
        x=x-y;  //x=15-5=10

        //print the values after swapping
        System.out.println("after swapping value of x and y  :"+x+" "+y);
    }
    
}
