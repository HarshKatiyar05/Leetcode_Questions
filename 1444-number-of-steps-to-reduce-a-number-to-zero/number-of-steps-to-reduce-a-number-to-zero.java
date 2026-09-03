class Solution {
    public int numberOfSteps(int n) {
        return reduce_to_zero(n,0);
    }
     static int reduce_to_zero(int n, int steps){
     if(n==0){
      return steps ;
     }
     if(n%2!=0){
        n = n-1;
        steps++;
     }else{
        n/=2;
        steps++;
     }
     return reduce_to_zero(n, steps) ;
  }
}