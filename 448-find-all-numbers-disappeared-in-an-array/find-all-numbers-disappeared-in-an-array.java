class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
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
           List<Integer> ans = new ArrayList<>();
         for(int index=0;index<arr.length;index++){
            if(arr[index]!=index+1){
               ans.add(index+1) ;
            }
         }
         return ans ;
      
    }
   
}