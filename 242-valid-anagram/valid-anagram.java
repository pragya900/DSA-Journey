class Solution {
    public boolean isAnagram(String s, String t) {
       HashMap<Character, Integer> map1 = new HashMap<>();
       HashMap<Character, Integer> map2 = new HashMap<>();
       char[] ch1 = s.toCharArray();
       char[] ch2 = t.toCharArray();
       for(char ch:ch1){
        map1.put(ch, map1.getOrDefault(ch,0)+1);
       } 
       for(char ch:ch2){
        map2.put(ch, map2.getOrDefault(ch,0)+1);
       }
       return map1.equals(map2); 
    }
}