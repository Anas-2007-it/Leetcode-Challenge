class Solution {
    public int minMoves2(int[] nums) {
        int move=0;
        Arrays.sort(nums);
        int median=nums[(nums.length)/2];
        for(int i:nums){
            move+=Math.abs(i-median);

        }
        return move;
        
    }
}