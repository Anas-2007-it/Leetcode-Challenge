class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        // arraylist-------> stores index with val
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                ans.add(i);
            }
        }
        return ans;//no element found      

        
    
    }
}