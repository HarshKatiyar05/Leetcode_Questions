class Solution {
    public int[] searchRange(int[] arr, int target) {

        int [] ans = new int[2] ;
        int start = search(arr,target,true) ;
        int end = search(arr, target, false) ;
           ans[0]=start;
           ans[1]=end;
           return ans ;
     }
   
    int search(int arr[], int target,boolean firstIndex){
      int s =0;
      int e = arr.length-1;
      int ans = -1;
      while(s<=e){
         int mid = s + (e-s)/2;
         if(target>arr[mid]){
            s = mid +1;
         }else if( target < arr[mid]){
              e = mid -1;
         }else{
            ans = mid ;
            if(firstIndex){
                  e = mid -1;
            }else{
                s = mid+1;
            }
         }
      }
      return ans ;
   }


}