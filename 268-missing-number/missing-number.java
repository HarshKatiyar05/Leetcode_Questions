class Solution {
    public int missingNumber(int[] arr) {
        int i=0;
        
          while(i<arr.length  ){
              int correct = arr[i] ;
            if(arr[i]<arr.length && arr[i] != arr[correct]){
                 Swap(arr,i,correct) ;
            }else{
              i++;
            }
          }
          for(int index=0;index<arr.length;index++){
                if(arr[index]!=index){
                  return index;
                }
          }
          return arr.length;
    }

    public  void Swap(int arr[],int start, int end){
                       int temp = arr[start] ;
                        arr[start]=arr[end] ;
                        arr[end]=temp ;
  }
}