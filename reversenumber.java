//reverse a number
import java.util.Scanner;
import java.util.*;

public class reversenumber {

    public static int  reverse(int n){
        int revNum = 0;
        while(n>0){
            int id = n % 10;
            revNum = (revNum * 10) + id;
            n = n / 10;
        }
        return revNum;
    }

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number to reverse :");
        int n = sc.nextInt();
        reverse(n);
        System.out.println("before reversing :"+ n);
        System.out.println("after reversing :" + reverse(n));
    }
    
}
