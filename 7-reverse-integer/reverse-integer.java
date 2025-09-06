class Solution {
    public int reverse(int x) {
        int reversednumber=0;
        while(x!=0){
        int pop = x%10;
        if(reversednumber>Integer.MAX_VALUE/10|| reversednumber<Integer.MIN_VALUE/10){
           return 0;
        }
        x /=10;
        reversednumber =(reversednumber*10)+ pop;
        }
        return reversednumber;

        
    }
}