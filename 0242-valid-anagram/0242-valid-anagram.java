class Solution {
    public boolean isAnagram(String s, String t) {
         HashMap<Character,Integer> map = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(char ch :s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch1:t.toCharArray()){
             map.put(ch1,map.getOrDefault(ch1,0)-1);
            if(map.get(ch1)<0){
                return false;
            }
           
        }
        return true;
    }
}