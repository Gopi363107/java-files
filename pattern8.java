//left aligned pattern like 1,22,333,4444,...
public class pattern8 {
    public static void pattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
                
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
