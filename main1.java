import java.util.Scanner;
import java.io.*;

public class main1{
    public static void main(String args []){
        int n ,temp;
        Scanner sc=new Scanner(System.in);

        //get input from user
        System.out.println("enter number of element in an array : ");
        n=sc.nextInt();

        System.out.println("enter an array elements : ");
        int[] d=new int[n];
        for(int i=0;i<n;i++){
            d[i]=sc.nextInt();
        }
        //assign variable to intialize value
        System.out.println("your original array : ");
        for(int num : d){
            System.out.print(num + " ");
        }
        System.out.println();


        for(int j=0;j<n;j++){

            for(int k=j+1;k<n;k++){

                if(d[j]<d[k]){
                    //swap d[i] and d[j] 
                    temp=d[j];
                    d[j]=d[k];
                    d[k]=temp;
                 }                 
            }            
        }
        System.out.println("sorted array in deascending order : ");
        for(int num : d){
            System.out.print(num +" ");
        }
    }
}