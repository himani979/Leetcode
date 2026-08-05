class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
         HashSet<Integer> set = new HashSet<>();
        for(int i: nums1){
            set.add(i);
        }
        HashSet<Integer> ans = new HashSet<>();
        for(int j : nums2){
            if(set.contains(j)){
                ans.add(j);
            }
        }
        int[] result = new int[ans.size()];
        int index=0;
        for(int num : ans){
             result[index]=num;
            index++;
        }
        return result;
    }
}