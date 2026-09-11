class Solution {
    public int countValidSelections(int[] nums) {
        int valid=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0) continue;
            int leftsum=0;
            int rightsum=0;
            for(int j=0;j<i;j++){
                leftsum+=nums[j];
            }
            for(int j=i+1;j<nums.length;j++){
                rightsum+=nums[j];
            }
            if(leftsum==rightsum) valid+=2;
            else if(Math.abs(leftsum-rightsum)==1) valid+=1;
            
        }
        return valid;
        
    }
}