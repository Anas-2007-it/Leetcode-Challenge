class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        for(int i: nums1){
            set.add(i);
        }
        HashSet<Integer> res=new HashSet<>();
        for(int i: nums2){
            if(set.contains(i)){
                res.add(i);
            }
        }
        int ans[]=new int[res.size()];
        int j=0;
        for(int i:res){
            ans[j]=i;
            j++;
        } 
        return ans;   

        
           
        
    }
}