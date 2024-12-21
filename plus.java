public class plus {
    public static void main(String args[]){
        int num=121;
        int org_num=num;
        int rev=0;

        while(num!=0){
            rev=rev*10 +num % 10;
            num=num/10;
        }
        System.out.println(rev);
        if(rev==rev){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
