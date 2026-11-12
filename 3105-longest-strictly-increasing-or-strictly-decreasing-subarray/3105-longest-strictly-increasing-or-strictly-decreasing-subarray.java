class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int p1=1;
        int p2=1;
        int res=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                p1+=1;
                p2=1;
            }
            else if(nums[i]<nums[i-1]){
                p2+=1;
                p1=1;
            }
            else{
                p1=1;
                p2=1;
            }
            res=Math.max(res,Math.max(p1,p2));
        }
        return res;
        
    }
}