class Solution {
    public int[] findErrorNums(int[] arr) {
        int i=0;
     while(i<arr.length){
          int correct_position= arr[i]-1;
          if(arr[i]!=arr[correct_position]){
             //swap
             int temp=arr[i];
             arr[i]=arr[correct_position] ;
             arr[correct_position]=temp;
          }else{
            i++;
          }      
     }
     for(int index=0;index<arr.length;index++){
       if(arr[index]!=index+1){
          return new int[]{arr[index],index+1} ;
       }
     }
     return new int[]{-1,-1};
    }
}