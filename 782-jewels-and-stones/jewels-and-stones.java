class Solution {
    public int numJewelsInStones(String jewels, String stones) {
       int count = 0;
       HashSet<Character> set = new HashSet<>();
       for(int i=0;i<jewels.length();i++){
        char c = jewels.charAt(i);
        set.add(c);
       } 
       for(int i=0;i<stones.length();i++){
        char c = stones.charAt(i);
        if(set.contains(c)){
            count++;
        }
       }
       return count;
    }
}