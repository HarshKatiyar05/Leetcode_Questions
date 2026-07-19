class Solution {

   public boolean search(int arr[][], int target, int row){
          int m= arr[0].length;
          int s=0;
          int e = m-1;
          while(s<=e){
            int mid = s+(e-s)/2;
            if(target==arr[row][mid]){
                return true;
            }else if(target>arr[row][mid]){
                s = mid+1;
            }else{
                e = mid -1;
            }
          }
          return false;
   }


    public boolean searchMatrix(int[][] arr, int target) {
        int m = arr.length;
        int n = arr[0].length;
        int s =0;
        int e=m-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(target>= arr[mid][0] && target<= arr[mid][n-1]){
                return search(arr,target,mid) ;
            }else if(target>arr[mid][n-1]){
                  s = mid+1;
            }else{
                e=mid-1;
            }
        }
        return false;
    }

}