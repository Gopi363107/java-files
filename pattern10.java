//right aligned traiangle increasable pattern
public class pattern10 {
    public static void pattern(int n){
        for (int i = 0; i < n; i++) {
            for (int j = n-i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
            
        }
    }
    //main function
    public static void main(String args[]){
        int n=6;
        pattern(n);
    }
    
}
