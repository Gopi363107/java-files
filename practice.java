import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.System;


public class practice {
    
    public static int is_palindrome(int num){
        int revnum = 0;
        while(num > 0){
            int id = num % 10;
            revnum = (revnum * 10) + id ;
            num = num / 10;
        }
        return revnum;
    }

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value of n :");
        int num = sc.nextInt();

        int revNum = is_palindrome(num);
        if(num == revNum){
            System.out.println(num+" is a palindrome");

        }
        else{
            System.out.println(num+" is not a palindrome");
        }
    }
    
}
