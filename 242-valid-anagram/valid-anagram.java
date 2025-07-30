class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(char ch: ch1){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(char ch : ch2){
            if(!map.containsKey(ch)){
                return false;
            }
            map.put(ch, map.get(ch)-1);
            if(map.get(ch)<0){
                return false;
            }
        }
        return true;
        
    }
}