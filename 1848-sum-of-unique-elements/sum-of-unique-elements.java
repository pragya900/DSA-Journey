class Solution {
    public int sumOfUnique(int[] nums) {
       int n = nums.length;
       int sum =0;
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int num :nums){
        map.put(num, map.getOrDefault(num,0)+1);
       } 
       for(int num : map.keySet()){
        if(map.get(num)==1){
            sum+=num;
        }
       }
       return sum;
    }
}