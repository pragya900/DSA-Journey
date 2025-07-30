class Solution {
    public char repeatedCharacter(String s) {
      char[] ch = s.toCharArray();
      int n = ch.length;
      char result = 'a';
      int ind = Integer.MAX_VALUE;
      HashMap<Character, Integer> map = new HashMap<>();
      for(int i=0;i<n;i++){
        map.put(ch[i], map.getOrDefault(ch[i],0)+1);
        if(map.get(ch[i])>=2){
            if(ind>i){
                ind =i;
                result = ch[i];
            }
        }
      } 
      return result;
    }
}
