class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] s1 = s.split(" ");
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();
        if(pattern.length() != s1.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            char c = pattern.charAt(i);
            if(map1.containsKey(c)){
                if(!map1.get(c).equals(s1[i])){
                    return false;
                }

            }
            else{
                map1.put(c,s1[i]);
            }
        }
        for(int i=0;i<s1.length;i++){
            char c = pattern.charAt(i);
            if(map2.containsKey(s1[i])){
                if(map2.get(s1[i])!=c){
                    return false;
                }
            }
            else{
                map2.put(s1[i],c);
            }
        }
        return true;
    }
}