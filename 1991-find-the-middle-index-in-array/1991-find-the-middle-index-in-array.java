class Solution {
    public int findMiddleIndex(int[] nums) {
        //SAME AS FIND PIVOT INDEX
        int total=0;
        for(int i:nums){
            total+=i;
        }
        int left=0;
        for (int i=0;i<nums.length;i++){
            int right=total-left-nums[i];
            if(left==right) return i;
            left+=nums[i];
        }
        return -1;

        
    }
}