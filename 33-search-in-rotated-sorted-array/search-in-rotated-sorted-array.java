class Solution {
    public int search(int[] arr, int target) {
        int pivot = find_pivotIndex(arr) ;

    if(pivot==-1){
        return OrderAgnostic_binarySearch(arr, 0, arr.length-1, target) ;
    }
    if(arr[pivot]==target){
      return pivot;
    }else if(arr[0]<=target){
          return OrderAgnostic_binarySearch(arr, 0, pivot-1, target) ;
    }else{
      return OrderAgnostic_binarySearch(arr, pivot+1, arr.length-1, target) ;
    }
    }

    static int OrderAgnostic_binarySearch(int arr[], int s, int e,int target){

     

      while(s<=e){
          int mid = s+(e-s)/2 ;

          if(target==arr[mid]){
            return mid ;
          }
          
            if(target<arr[mid]){
               e = mid-1;
            }else{
              s= mid+1;
            }
          
        }
      return -1;
      
    }
    static int find_pivotIndex(int arr[]){
      int s= 0;
      int n = arr.length;
      int e = n-1;

      while(s<=e){
        int mid = s + (e-s)/2;
        if( mid<e && arr[mid]>arr[mid+1]){
          return mid;
        }
        if(mid >s &&   arr[mid]<arr[mid-1]){
          return mid-1;
        }
        if(arr[s]>=arr[mid]){
           e = mid -1;
        }else{
          s = mid+1;
        }
      }
      return -1;
  }
}