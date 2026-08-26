class Solution {
    public int searchInsert(int[] nums, int target) {
          int s = 0 ;
          int n = nums.length;
          int e = n-1;
          int as =n;

          while(s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid]==target){
                return mid ;
            }else if(nums[mid]>target){
                  as = mid;
                   e=mid-1;
            }else{
                s = mid+1;
            }
          }
          return as;
    }
}