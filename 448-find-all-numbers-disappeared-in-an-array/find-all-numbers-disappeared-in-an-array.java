class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       int n = nums.length;
       ArrayList<Integer> list = new ArrayList<>();
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<n;i++){
            map.put(i+1,1);
       } 
       for(int i=0;i<n;i++){
        if(map.containsKey(nums[i])){
            map.put(nums[i], map.get(nums[i])+1);
        }
        else{
            map.put(nums[i],1);
        }
       }
       for(int num : map.keySet()){
        if(map.get(num)==1){
            list.add(num);
        }
       }
       return list;
    }
}