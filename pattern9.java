//center aligned number increasing pattern
public class pattern9 {
    public static void pattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j > 0 ; j--) {
                System.out.print(" ");
                
            }
            for (int k = 1; k <= i ; k++) {
                System.out.print("* ");
                    
            }
            System.out.println();
            
            
        }
    }

    //main function
    public static void main(String args[]){
        int n=10;
        pattern(n);
    }
    
}
