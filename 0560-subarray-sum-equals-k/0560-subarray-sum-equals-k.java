class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int idx;
        int ans=0;
        int pre=0;
        map.put(0,1);
        for(idx=0;idx<nums.length;idx++){
            pre=pre+nums[idx];
            int sub=pre-k;
            if(map.containsKey(sub)==true){
                ans+=map.get(sub);
                
            }
            map.put(pre,map.getOrDefault(pre,0)+1);
        }
        return ans;
        
    }
}