class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int [] c = new int[nums1.length + nums2.length];
       double a =0;
       for(int i = 0;i<nums1.length;i++){
           c[i]=nums1[i];
       } 
       for(int i =0;i<nums2.length;i++){
           c[i+nums1.length]=nums2[i];
       }
       int n = c.length;
       Arrays.sort(c);
       if(n%2==0){
           a = (double)(c[n/2]+c[(n/2)-1])/2;

       }else{
           a = (double)c[(n/2)];
       }
       return a;
    }
}