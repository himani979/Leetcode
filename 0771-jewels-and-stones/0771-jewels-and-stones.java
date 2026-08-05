class Solution {
    public int numJewelsInStones(String jewels, String stones) {
         int count=0;
        for(char ch1 : stones.toCharArray()){
            
            if(jewels.contains(String.valueOf(ch1))){
                count++;
            }
        }
        return count;
    }
}