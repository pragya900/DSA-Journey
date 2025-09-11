class Solution {
    public int climbStairs(int n) {
       if(n==1){
        return 1;
       } 
       if(n==2){
        return 2;
       }
       int two_back = 1;
       int one_back =2;
       for(int i = 2;i<n;i++){
        int next_num= two_back+one_back;
        two_back = one_back;
        one_back = next_num;
       }
       return one_back;
    }
}