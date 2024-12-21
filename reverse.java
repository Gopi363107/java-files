public class reverse {
    public static void main(String args[]){
        //input array
        int[] arr={1,2,3,4,5,6};
        int n=arr.length;

        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
        int i=0;
        int j=n-1;

        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
        }

        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
        
    }
    
}
