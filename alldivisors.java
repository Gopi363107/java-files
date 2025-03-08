//print all divisors of a num
import java.util.Scanner;
import java.util.*;
import java.lang.System;


public class alldivisors {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check prime :");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            if(n % i == 0){
                System.out.print(i+" ");
            }
        }

        
    }
    
}
