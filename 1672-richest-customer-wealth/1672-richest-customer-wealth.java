class Solution {
    public int maximumWealth(int[][] accounts) {
         int ans=Integer.MIN_VALUE;
         
        for (int[] person : accounts) {
        int sum = 0;
        for (int money : person) {
            sum += money;
        }
        if(sum>ans){
                ans=sum;
            }
    }
        return ans;
    }
}