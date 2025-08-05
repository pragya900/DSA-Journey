class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    
       Set<List<Integer>> set = new HashSet<>();
       
       int n = nums.length;
       for(int i=0;i<n;i++){
        HashSet<Integer> st = new HashSet<>();
        for(int j=i+1;j<n;j++){
            int k = -(nums[i]+nums[j]);
            if(st.contains(k)){
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],k);
                    temp.sort(null);
                    set.add(temp);
            }

            st.add(nums[j]);
            }
        }
     List<List<Integer>> result = new ArrayList<>(set);
        return result;
    }
}