class Solution {
    public int findPeakElement(int[] nums) {
        //CHECK FOR FIRST AND LAST ELEMENT TO BE PEAK
        if(nums.length==1 || nums[0]>nums[1]){
            return 0;
        }
        if(nums[nums.length-1]>nums[nums.length-2]){
            return nums.length-1;
        }
        int start=1;
        int end=nums.length-2;
        int mid;
        while(start<=end){
            mid=(start+end)/2;
            //CHECK FRONT AND NEXT OF MID
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(nums[mid]<nums[mid-1]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
       
        
    }
}