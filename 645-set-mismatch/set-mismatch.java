class Solution {
    public int[] findErrorNums(int[] nums) {
       int n = nums.length;
       HashSet<Integer> set = new HashSet<>();
       HashMap<Integer, Integer> map = new HashMap<>();
       ArrayList<Integer> list = new ArrayList<>();
       for(int i=0;i<n;i++){
        if(map.containsKey(nums[i])){
            map.put(nums[i],map.get(nums[i])+1);
        }
        else{
            map.put(nums[i],1);
        }
       }
       for(int key: map.keySet()){
        if(map.get(key)==2){
            list.add(key);
        }
       }
       for(int i=0;i<n;i++){
        set.add(nums[i]);
       } 
       for(int i=1;i<=n;i++){
        if(!set.contains(i)){
            list.add(i);
        }
       }
       
       return list.stream().mapToInt(i -> i).toArray();
    }
}