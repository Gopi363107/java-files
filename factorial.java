//find the factorial of given number
import java.util.Scanner;
import java.math.BigInteger;
public class factorial {
    public static void main(String args[]){
        //get input from the user
        Scanner sc=new Scanner(System.in);
        int n,c,fact=1;
        System.out.println("enter the value of n :");
        n=sc.nextInt();
        if(n<0){
            System.out.println("number should be non negative.");
        }else{
            for(c=1;c<=n;c++){
                fact=fact*c;
                
            }
            System.out.println("factorial of "+n+" is "+fact);
        }
    }
    
}
