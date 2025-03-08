//swapping two variable without using third variable
import java.util.Scanner;
public class wswap {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //geting input from the user
        int x,y;
        System.out.println("enter value of x : ");
        x=sc.nextInt();
        System.out.println("enter value of y : ");
        y=sc.nextInt();

        //swap the two values
        x=x+y;
        y=x-y;
        x=x-y;

        //print the values after swapping
        System.out.println("value of x is : "+x);
        System.out.println("value of y is : "+y);

    }
    
}
