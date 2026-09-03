class Solution {
    public int numberOfSteps(int n) {
        int steps = 0 ;
    while(n>0){
      if(n%2!=0){
          n = n -1;
          steps++;
      }else{
          n = n/2;
          steps++;
      }
    }
    return steps;
    }
}