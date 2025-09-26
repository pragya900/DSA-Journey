class Solution {
    public int[] countBits(int n) {
       int m = n+1;
       int[] nums = new int[m];
       for(int i = 0; i<m;i++){
        nums[i]=count(i);

       }  
       return nums;
    }
     public int count(int x){
        int res = 0;
        if(x==0){
            res = 0;
        }
        while(x>0){
            x = x&(x-1);
            res+=1;
        }
        return res;

     }
}