public class max {
    public static void main(String args []){
        //original array
        int[] arr={2,5,3,1,8,4,9};

        //get
        System.out.println(arr[3]);
        
        //set
        arr[2]=30;
        System.out.println(arr[2]);

        //length
        System.out.println(arr.length);

        int min=Integer.MAX_VALUE;

        //maximum value of array element

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("minimum value of the array is: "+min);
    }
    
}
