//riht aligned character triangle
public class pattern27 {
    public static void main(String args[]){
        int n=5;
        pattern(n);
    }
    public static void pattern(int n){
        for (int i = 0; i <= 2*n-1; i++) {
            if(i<=n){
                for (int j = 0; j <= n-i; j++) {
                    System.out.print(" ");
                }
                for (char ch = 'A'; ch <= 'A'+i-1 ; ch++) {
                    System.out.print(ch+" ");
                }
                System.out.println();
            }
            else{
                for (int j = 0; j <= i-n; j++) {
                    System.out.print(" ");
                }
                for (char ch = 'A'; ch <= 'A'+(2*n-i-1) ; ch++) {
                    System.out.print(ch+" ");
                }
                System.out.println();
            }    
        }
    }
    
}
