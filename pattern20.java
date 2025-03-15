public class pattern20 {

    public static void main(String args[]){
        int n=6;
        pattern(n);

    }

    public static void pattern(int n){
        for (int i = 0; i <= 2*n-1; i++) {
            if(i<=n){
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                for (int j = 1; j < 2*n-(2*i); j++) {
                    System.out.print(" ");
                }
                for (int j = i; j >=1; j--) {
                    System.out.print(j);
                }
                System.out.println(); 
            }
            else{
                for (int j = 1; j <= 2*n-i; j++) {
                    System.out.print(j);
                }
                for (int j = 1; j < 2*i-(2*n); j++) {
                    System.out.print(" ");
                }
                for (int j =2*n-i ; j >=1; j--) {
                    System.out.print(j);
                }
                System.out.println(); 

            }    
        }   
    }  
}
