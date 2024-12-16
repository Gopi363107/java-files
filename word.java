import java.util.Scanner;
import java.lang.System;

public class word {
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        //get input from the user
        System.out.println("enter number of array in the element : ");
        n=sc.nextInt();
        System.out.println("enter the element in an array : ");
        int[] a=new int[n]; 
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        //print the values
        System.out.println("original array elements : ");
        for(int num:a){
            System.out.print(num+" ");
        }
        System.out.println();

        //assign the third variable
        System.out.println("enter the remove element : ");
        int s=sc.nextInt();
        System.out.println();
        //remove the element from array
        for(int i=0;i<n;i++){
            if(s==a[i]){
                int ElementToRemove=a.remove(s);
            }
        }
        System.out.println("after removing the value array : ");
        for(int num:a){
            System.out.print(num +" ");
        }        
    }    
}
