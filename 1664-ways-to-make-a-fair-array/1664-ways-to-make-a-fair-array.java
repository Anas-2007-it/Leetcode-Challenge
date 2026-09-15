class Solution {
    public int waysToMakeFair(int[] nums) {
        int teven=0;
        int todd=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                teven+=nums[i];
            }
            else  todd+=nums[i];
        }
        int leven=0;
        int lodd=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0) teven-=nums[i];
            else todd-=nums[i];
            int neven=leven+todd;
            int nodd=lodd+teven;
            if(neven==nodd)  count+=1;
       
            if(i%2==0) leven+=nums[i];
            else lodd+=nums[i];
        }
        return count;    

        
    }
}