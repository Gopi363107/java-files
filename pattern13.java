public class pattern13 {

    public static void main(String args[]){
        int n =8;
        pattern(n);
    }

    public static void pattern(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");    
            }
            for (int j = 0; j < i*2+1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
