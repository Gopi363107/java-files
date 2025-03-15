//center based diamond star pattern triangle

import java.io.*;

public class pattern11{
    public static void main(String args[]){
        int n = 6;
        pattern(n);
    }
    static void pattern(int n){
        for(int i = 0;i< n;i++){
            for(int j=0 ;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k < i;k++){
                System.out.print("* ");
            }
            for(int j=0 ;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    
        for(int i = 0;i < n ;i++){    
            for(int j=0 ;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k < n-i-1;k++){
                System.out.print("* ");
            }
            for(int j=0 ;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
}