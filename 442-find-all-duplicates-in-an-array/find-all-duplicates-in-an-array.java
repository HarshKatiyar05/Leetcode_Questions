class Solution {
    public List<Integer> findDuplicates(int[] arr) {
          
         int i=0;
         while(i<arr.length){
               int correct_postion=arr[i]-1;
               if(arr[i]!=arr[correct_postion]){
                    Swap(arr,i,correct_postion) ;
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
     public void Swap(int arr[],int start, int end){
                       int temp = arr[start] ;
                        arr[start]=arr[end] ;
                        arr[end]=temp ;
  }
}