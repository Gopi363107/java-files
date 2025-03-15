import java.io.*;

public class pattern11{
    public static void main(String args[]){
        int n = 2;
        pattern(n);
    }
    static void pattern(int n){
        for(int i = 1;i<=n;i++){
            for(int j=n-i ;j>0;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1;i<=n;i++){
            for(int j=1 ;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=n;k>0;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}