//o check the given number is palindrome or not
import java.util.Scanner;
import java.util.*;

public class prime {

    public static boolean isprime(int n){
        int a= 0;
        if(n <=1){
            a = 0;
        }
        else{
            for(int i=1;i<= n;i++){
                if(n%i !=0){
                    a = 0;
                }
                else{
                    a = 1;
                }
            }
        }
        if(a==0){
            return false;
        }else{
            return true;
        }
        
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check prime or not :");
        int n = sc.nextInt();
        System.out.println(isprime(n));
        
    }
    
}
