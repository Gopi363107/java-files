//left aligned character decreasable triangle
public class pattern26 {
    public static void main(String args[]){
        int n=5;
        pattern(n);
    }

    public static void pattern(int n){
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A'+(n-i-1); ch++) {
                System.out.print(ch+" ");
                
            }
            System.out.println();
            
        }
    }
    
}
