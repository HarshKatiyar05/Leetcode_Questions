class Solution {
    public int splitArray(int[] arr, int k) {
         int s = 0 ;
         int e = 0;
         int ans = -1;
         for(int i=0;i<arr.length;i++){
            s = Math.max(s,arr[i]) ;
            e = e+arr[i] ;
         }
         while(s<=e){
            int mid = s+(e-s)/2;
            if(isValidAns(mid,k,arr)){
                ans = mid ;
                e=mid-1;
            }else{
                s=mid+1;
            }
         }
         return ans ;
    }
    static boolean isValidAns(int mid,int k,int arr[]){
        int pieces=1;
        int totalSum=0;
        for(int i=0;i<arr.length;i++){
            if(totalSum+arr[i]<=mid){
                totalSum+=arr[i] ;
            }else{
                pieces++;
                if(pieces>k || arr[i]>mid){
                    return false;
                }else{
                    totalSum=0;
                    totalSum+=arr[i] ;
                }
            }
        }
        return true;
    }
}