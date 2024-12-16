import java.util.*;
import java.util.Scanner;

public class sum {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //get input array from the user
        System.out.println("enter the number of element in an array : ");
        int n=sc.nextInt();

        System.out.println("enter the array elements : ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("original array is : ");
        
    }
    
}
