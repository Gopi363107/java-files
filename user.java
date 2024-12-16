import java.util.Scanner;
import java.io.*;
public class user {
    
    public static void main(String args []){

        String a;
        int b;
        float c;
        Scanner in=new Scanner(System.in);
        System.out.println("enter your name:");
        a=in.nextLine();
        System.out.println("enter your age:");
        b=in.nextInt();
        System.out.println("enter your cgpa:");
        c=in.nextFloat();
        System.out.println("your name : "+a);
        System.out.println("your age : "+b);
        System.out.println("your cgpa : "+c);
    }
    
}
