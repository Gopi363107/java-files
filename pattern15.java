//center based diamond odd number count star pattern
public class pattern15 {

    public static void main(String args[]){
        int n=6;
        pattern(n);
    }

    public static void pattern(int n){
        for (int i = 0; i < n; i++) {// first above triangle 
            for (int j = 0; j < n-i-1; j++) {//for before space
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {//for star pattern
                System.out.print("*");
            }
            for (int j = 0; j < n-i-1; j++) {//for after space
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {//for below triangle 
            for (int j = 0; j < i; j++) {//for before space 
                System.out.print(" ");
            }
            for (int j = 0; j < 2*n -(2*i+1); j++) {  //for star pattern decreasable pattern
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {  //for after star pattern space
                System.out.print(" ");
            }
            System.out.println();
            
        }
    }
    
}
