class Solution {
    public int[] runningSum(int[] nums) {
        int index = 0;
        int newArray[]= new int[nums.length] ;
        for(int i=0;i<nums.length;i++){
             for(int j=0;j<=i;j++){
                  newArray[index]+=nums[j] ;
                  
             }
             index++;
        }
        return newArray;
    }
}