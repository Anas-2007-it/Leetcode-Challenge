class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=-1;
        int right=-1;
        int st=0;
        int end=nums.length-1;
        int mid;
        while(st<=end){
            mid=(st+end)/2;
            if(nums[mid]==target){
                left=mid;
                end=mid-1;
            } 
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }      
        st=0;
        end=nums.length-1;
        while(st<=end){
            mid=(st+end)/2;
            if(nums[mid]==target){
                right=mid;
                st=mid+1;
            } 
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                st=mid+1;
            } 
        }
        return new int []{left,right};
        
             
        
        
        
    }
}