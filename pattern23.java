//left aligned character triangle

public class pattern23 {
    public static void main(String args[]){
        int n=6;
        pattern(n);
    }

    public static void pattern(int n){
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <='A'+i ; ch++) {
                System.out.print(ch +" ");
                
            }
            System.out.println();
            
        }
    }

    
}
