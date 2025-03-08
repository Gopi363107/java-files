import java.util.Scanner;

public class swap{
    public static void main(String args[]){
        //get input fromthe user
        Scanner sc=new Scanner(System.in);
        int a,b,temp;
        System.out.println( "enter value of a :");
        a=sc.nextInt();
        System.out.println( "enter value of b :");
        b=sc.nextInt();

        //print the values before swapping
        System.out.println("value of a : "+a);
        System.out.println("value of b : "+b);

        //Swapping
        temp=a;
        a=b;
        b=temp;

        //print the values after swapping
        System.out.println("value of a : "+a);
        System.out.println("value of b : "+b);
    }
}