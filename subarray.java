public class subarray {
    public static void main(String args []){
        //input array
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        //print original array
        System.out.println("original array : ");
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();

        //using for loop print subarrays of the element
        for(int si=0;si<n;si++){
            for(int ei=0;ei<n;ei++){

                //assign third variable for print sub array
                for(int k=si;k<=ei;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();                                 
            }            
        }        
    }    
}
