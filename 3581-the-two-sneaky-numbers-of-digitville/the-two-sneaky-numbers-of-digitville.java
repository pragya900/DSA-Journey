class Solution {
    public int[] getSneakyNumbers(int[] nums) {
       int n = nums.length;
       int[] result = new int[2];
       int k=0;
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<n;i++){
        map.put(nums[i], map.getOrDefault(nums[i],0)+1);
       } 
       for(int num: map.keySet()){
        if(map.get(num)==2){
            result[k]=num;
            k++;
        }
       }
       return result;
    }
}