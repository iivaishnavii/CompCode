class SparseSearch{


    private static int binarySearch(String[] arr,int low,int high,String x){
        
        while(low<=high){
            int mid = low + (high-low)/2;
            
            if(arr[mid] == ""){
                int left = mid-1,right = mid+1;
                while(left < right){
                    if(left < low && right > high) return -1;

                    if(left >= low && arr[left]!="") {
                        mid = left;
                        break;
                    }
                    if(right <= high && arr[right]!="") {
                        mid = right;
                        break;
                    }
    
                    left--;
                    right++;
                }
               
            }
            if(arr[mid] == x) return mid;
            else if(x.compareTo(arr[mid]) > 0) low =mid+1;
            else high = mid-1;
        }
        return -1;

    }


    public static void main(String[] args){
       String[] arr = {"aaa","","","cccc","dddd"};
       System.out.println(binarySearch(arr,0,arr.length-1,"aaa"));
    }
}