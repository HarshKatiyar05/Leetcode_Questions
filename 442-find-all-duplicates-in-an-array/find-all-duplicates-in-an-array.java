class Solution {
    public List<Integer> findDuplicates(int[] arr) {
          
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
         List<Integer> ans = new ArrayList<>() ;
         for(int in=0;in<arr.length;in++){
            if(arr[in]!=in+1){
                ans.add(arr[in]) ;
            }
         }
         return ans ;
        
    }
   
}