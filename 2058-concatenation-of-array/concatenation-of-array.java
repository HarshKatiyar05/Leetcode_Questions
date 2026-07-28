class Solution {
    public int[] getConcatenation(int[] nums) {
       int index=0;
        int newArray[]= new int[nums.length*2] ;
        for(int i=0;i<nums.length;i++){
             newArray[index] = nums[i] ;
             index++;
        }
        for(int i=0;i<nums.length;i++){
             newArray[index] = nums[i] ;
             index++;
        }
        return newArray;
    }
}