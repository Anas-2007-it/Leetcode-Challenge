class Solution {
    public void sortColors(int[] nums) {
        int count0=0;
        int count1=0;
        int count2=0;
        for (int i:nums){
            if(i==0) count0++;
            else if(i==1) count1++;
            else count2++;


        }
        int j=0;
        while(count0>0){
            nums[j]=0;
            j++;
            count0--;
        }
        while(count1>0){
            nums[j]=1;
            j++;
            count1--;

        }
        while(count2>0){
            nums[j]=2;
            j++;
            count2--;
        }
        
    }
}