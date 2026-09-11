class Solution {
    public int minStartValue(int[] nums) {
        int sum=0;
        int mini=0;
        for(int i:nums){
            sum+=i;
            mini=Math.min(sum,mini);
        }
        return 1-mini;
        
    }
}