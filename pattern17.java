public class pattern17 {
    public static void main(String args[]){
        int n=6;
        pattern(n);
    }

    public static void pattern(int n){

        int start=1;  
        for (int i = 0; i < n; i++) {
            if(i%2==0) start = 0;
            else start = 1;
            
            for (int j = 0; j < i; j++) {
                System.out.print(start+" ");
                start = 1-start;
            }
            System.out.println();    
        }
    }
    
}
