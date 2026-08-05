class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> set=new HashMap<>();
       for(char ch: s.toCharArray()){
        set.put(ch,set.getOrDefault(ch,0)+1);
    }
    ArrayList<Character> list=new ArrayList<>(set.keySet());
   Collections.sort(list,(a,b) -> set.get(b) - set.get(a));
   StringBuilder ans = new StringBuilder();
   for(char ch: list){
    int freq=set.get(ch);
     while(freq>0){
        ans.append(ch);
        freq--;
     }
   }
   return ans.toString();

}
}