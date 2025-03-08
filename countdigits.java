import java.util.*;
public class countdigits{
    /*public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of num  for count a digits :");
        int num = sc.nextInt();
        int cnt = 0;
        while (num > 0){
            cnt +=1;
            num /= 10;
        }

        System.out.println("count of the digit is "+ cnt);
    }*/

    public static int countdigit(int n){
        int count = 0 ;
        while(n > 0 ){
            count = count + 1;
            n = n / 10 ;
        }
        return count;
    }
    public static int cntdigits(int n){
        int cnt = (int) (Math.log10(n)+1);
        return cnt;
    }

    

    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the value of n to count the digits :");
        int n = sc.nextInt();
        int digits =countdigit(n);
        int digit =cntdigits(n);
        System.out.println(" digits count of "+n+" is "+digits);
        System.out.println(" digits count of "+n+" is "+digit);

    }
}