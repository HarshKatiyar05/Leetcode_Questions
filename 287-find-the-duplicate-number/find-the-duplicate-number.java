class Solution {
    public int findDuplicate(int[] arr) {
        int i=0;
         while(i<arr.length){
               int correct_position=arr[i]-1;
               if(arr[i]!=arr[correct_position]){
                int temp = arr[i] ;
                        arr[i]=arr[correct_position] ;
                        arr[correct_position]=temp ;
               }else{
                i++;
               } 
    }
    for(int index=0;index<arr.length;index++){
         if(arr[index]!=index+1){
            return arr[index]; 
         }
    }
    return -1;
}
}