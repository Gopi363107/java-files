import java.util.Scanner;
import java.io.*;
public class temp {
    public static void main(String args[]){
        //assign the variables for getting input from the user
        int x;
        int y;
        int temp;
        Scanner in=new Scanner(System.in);
        //get input from the user
        System.out.println("enter value of x:");
        x=in.nextInt();
        System.out.println("enter value of y:");
        y=in.nextInt();
        //print the values before swapping
        System.out.println("before swapping the two variables : "+x+" "+y);

        //swap two variables using temp variable
        temp=x;
        x=y;
        y=temp;

        //print the values after swapping the values
        System.out.println("after swapping your value x : "+x);
        System.out.println("after swapping your value y : "+y);


    }
    
}
