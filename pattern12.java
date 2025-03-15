public class pattern12 {
    public static void main(String args[]){
        int n=6;
        pattern(n);
    }
    public static void pattern(int n){
        for(int i = 0; i < n; i++){//row 0 to n
            for (int j = 0; j < n-i-1; j++) {//front space
                System.out.print(" ");   
            }
            for (int j2 = 0; j2 < i ; j2++) {//star pattern
                 System.out.print("* ");   
            }
            for (int j = 0; j > n-i-1; j++) {//front space
                System.out.print(" ");   
            }
            
            System.out.println();//after printing every row it will go to nextline
        }
    }
}
