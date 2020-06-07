//Missing in rotated sorted array
public class HelloWorld{
    
    private static int missing(int[] arr){
        int low = 0 ;
        int high = arr.length-1;
        
        
        while(high-low >= 2){
            int mid = low+(high-low)/2;
            int midIndexDiff = arr[mid] - mid;
            int lowIndexDiff = arr[low] - low;
            int highIndexDiff = arr[high] -high;
            
            if(midIndexDiff != lowIndexDiff){
                high = mid;
            }else if(highIndexDiff != midIndexDiff){
                low = mid;
            }
        }
        
        return (arr[high]+arr[low])/2;
        
    }

     public static void main(String []args){
        int[] arr={1,2,3,4,6,7};
        
        System.out.println(missing(arr));
     }
}