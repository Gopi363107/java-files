//left aligned  0 and 1 using pattern 

public class pattern18 {
    public static void main(String args[]){
        int n=6;
        pattern(n);
    }

    public static void pattern(int n){
       int start = 1;
       for (int i = 0; i < 2*n-1; i++) {
            if (i%2==0) start = 1;
            else start = 0;

            if(i<=n){
                for (int j = 0; j < i; j++) {
                    System.out.print(start+" ");
                    start = 1-start;     
                }
                System.out.println();
                
            }
            else{
                for (int j = 0; j < 2*n-i; j++) {
                    System.out.print(start+" ");
                    start = 1-start;     
                }
                System.out.println();
            }
        }
       
    }
    
}
