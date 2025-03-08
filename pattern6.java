//left aligned increasing values like 1,2,3,4....
public class pattern6 {
    public static void pattern(int n){
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num+" ");
                num++;
            }
            
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n =  10;
        pattern(n);
    }
    
}
