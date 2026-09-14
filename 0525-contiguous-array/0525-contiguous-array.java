class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max1=0;
        int bal=0;
        map.put(0,-1);
        for(int i =0;i<nums.length;i++){
            if (nums[i]==0) bal--;
            else bal++;
            if(map.containsKey(bal)){
                int len=i-map.get(bal);
                max1=Math.max(len,max1);
            }
            else map.put(bal,i);;
        }
        return max1;
        
    }
}