import java.util.Scanner;

public class newjava{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //get input from the user
        System.out.println("enter the value for x,y,z :");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();

        
        //create new variable to assign the value
        int a=x+y+z;
        int b=x*y*z;

        //print the output values
        System.err.println("addition of all the value is :"+a);
        System.out.println("multiplication of all value is :"+b);


    }
}