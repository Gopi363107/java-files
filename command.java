import java.util.Scanner;
public class command{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("rnter the value of x and y :");
        int x=sc.nextInt();
        int y=sc.nextInt();

        System.out.println("before swapping the value of x and y :"+x +y);

        int temp=x;
        x=y;
        y=temp;

        System.out.println("your updated value : "+x +y);
    }
}