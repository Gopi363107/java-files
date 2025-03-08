//find the largest number
import java.util.Scanner;
public class largest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x,y,z;
        //get input from the user
        System.out.println("enter the value of x : "); 
        x=sc.nextInt();
        System.out.println("enter the value of y : ");
        y=sc.nextInt();
        System.out.println("enter the value of z : ");
        z=sc.nextInt();
        
        //find the largest value using if condition
        if(x>y && x>z){
            System.out.println("x is the greatest value.");
        }
        else if(y>z && y>x){
            System.out.println("y is the greatest value.");
        }
        else if(z>x && z>y){
            System.out.println("z is the greatest value.");
        }
        else{
            System.out.println("entered number is not distinct...");
        }
            
        
    }
    
}
