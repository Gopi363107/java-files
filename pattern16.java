public class pattern16 {

    public static void main(String args[]){
        int n=6;
        pattern(n);
    }

    public static void pattern(int n){
        for (int i = 0; i < 2*n-1; i++) {
            if(i<= 6){
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            else {
                for (int j = 0; j < 2*n-i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }    
        }
    }
    
}
