class Solution {
    public char findTheDifference(String s, String t) {
       HashMap<Character,Integer> map = new HashMap<>();
       for(char ch : s.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0)+1);
        
       }
   for(char ch1 : t.toCharArray()){
     if(!map.containsKey(ch1)){
        return ch1;
    }
    map.put(ch1,map.get(ch1)-1);
    if(map.get(ch1)<0){
        return ch1;
    }
   
   }
   return ' ';
    }
}