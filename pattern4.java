//rightaligned decreasable pattern
public class pattern4 {

    public static void pattern(int n){
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j <= n-i ; j++) {
                System.out.print(" ");
                
            }
            for (int j2 = 1; j2 <= i; j2++) {
                 System.out.print("*");   
            }
            System.out.println();
            
        }
    }
    public static void main(String args[]){
        int n = 10 ;
        pattern(n);
    }
    
}
