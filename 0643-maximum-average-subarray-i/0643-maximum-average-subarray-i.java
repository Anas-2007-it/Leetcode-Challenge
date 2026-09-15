class Solution {
    public double findMaxAverage(int[] nums, int k) {
        //SLIDING WINDOW APPOACH
        int sum=0;
        int i=0;
        //First window calclate....
        for( i=0;i<k;i++){
            sum+=nums[i];
        }
        int maxsum=sum;
        for(i=k;i<nums.length;i++){
            sum=sum+nums[i]-nums[i-k];//remove left most and add new for current window
            maxsum=Math.max(maxsum,sum);
        }
        return (double)maxsum/k;
        
    }
}