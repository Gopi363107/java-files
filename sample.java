import java.util.Scanner;
import java.lang.System;

public class sample{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    //get input from the user number of element in an array
    System.out.println("enter number of element in an array : ");
    int n=sc.nextInt();

    //get array element
    System.out.println("enter element in an array : ");
    int[] a=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }

    //print the original array elements
    System.out.println("your original array is : ");
    for(int num: a){
      System.out.print(num+" ");
    }
    System.out.println();

    //find the sorted array using swap
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        if(a[i]>a[j]){
          int temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }
    }
    //your sorted array in ascending order
    System.out.println("sorted array in ascending order : ");
    for(int num:a){
      System.out.print(num+" ");
    }
  }
}