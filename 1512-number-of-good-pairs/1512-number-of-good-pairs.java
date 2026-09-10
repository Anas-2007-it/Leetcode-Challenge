class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> set =new HashMap<> ();
        int count=0;
        for (int i : nums){
            count+=set.getOrDefault(i,0);
            set.put(i,set.getOrDefault(i,0)+1);


        }
        return count;
        
    }
}