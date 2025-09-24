class Solution {
    public int longestConsecutive(int[] nums) {
       int n = nums.length;
       int count =0;
       int longest =1;
       int lSmallest = Integer.MIN_VALUE;
       Arrays.sort(nums);
       if(n==0){
           return 0;
       }
       for(int i =0;i<n;i++){
            if(nums[i]-1==lSmallest){
                count++;
                lSmallest=nums[i];
            }
            else if (nums[i]!=lSmallest){
                count =1;
                lSmallest=nums[i];
            }
            longest= Math.max(count,longest);
       } 
       return longest;
    }
}