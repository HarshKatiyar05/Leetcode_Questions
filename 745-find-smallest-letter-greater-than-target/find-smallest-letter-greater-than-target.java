class Solution {
    public char nextGreatestLetter(char[] ch, char target) {
      int s = 0;
      int e = ch.length-1;
      char ans ='\0';

      if(target>= ch[e]){
          return ch[0] ;
      }
      while(s<=e){
        int mid = s + (e-s)/2 ;
        if(target<ch[mid]){
          ans = ch[mid] ;
          e = mid -1;
        }else{
          s = mid+1;
        }
      }
      return ans ;
    }
}