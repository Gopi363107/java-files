import java.util.Scanner;

public class main{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //get input enter the number of array
        System.out.println("enter the number of element in an array : ");
        int n=sc.nextInt();

        //get input array
        System.out.println("enter the array element : ");
        int[] a=new int[n];
        for(int j=0;j<n;j++){
            a[j]=sc.nextInt();
        }

        int s=a[0];

        for(int i=0;i<n;i++){
            if(s>a[i]){
                s=a[i];
            }
        }
        System.out.println("your minimum element in an array : "+s);
    }
}