class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=findfirst(nums,target);
        int last = findlast(nums,target);
        int[] nums2 = new int[2];
        nums2[0]=first;
        nums2[1]=last;
        return nums2;
        
    }
    public static int findfirst(int[] nums, int target){
        int first =-1;
        int n = nums.length;
        int low =0,high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                first = mid;
                high = mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return first;
    }
    public static int findlast(int[] nums, int target){
        int last =-1;
        int n = nums.length;
        int low=0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                last = mid;
                low=mid+1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return last;
    }

}