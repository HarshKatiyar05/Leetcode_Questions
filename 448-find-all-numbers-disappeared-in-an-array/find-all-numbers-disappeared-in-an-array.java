class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
         int i=0;
         while(i<arr.length){
               int correct_postion=arr[i]-1;
               if(arr[i]!=arr[correct_postion]){
                    Swap(arr,i,correct_postion) ;
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
     public void Swap(int arr[],int start, int end){
                       int temp = arr[start] ;
                        arr[start]=arr[end] ;
                        arr[end]=temp ;
  }
}