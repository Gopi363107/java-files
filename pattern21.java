//left aligned number increasing triangle
public class pattern21 {

    public static void main(String args[]){
        int n=6;
        pattern(n);
    }

    public static void pattern(int n){
        int num=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num+" ");
                num++;
                
            }
            System.out.println();
        }
    }
    
}
