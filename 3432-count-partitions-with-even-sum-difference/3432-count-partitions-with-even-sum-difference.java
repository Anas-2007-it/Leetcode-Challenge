class Solution {
    public int countPartitions(int[] nums) {
        // N IS SIZE OF ARRAY TOTAL PARTITON----->N-1(EVEN SUM)
        int total=0;
        for(int i:nums){
            total+=i;
        }
        if(total%2==0) return nums.length-1;
        return 0;// ODD SUM CONDITION
        
        
    }
}