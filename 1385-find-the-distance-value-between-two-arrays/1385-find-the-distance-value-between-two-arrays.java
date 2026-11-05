class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        for(int i:arr1){
            int flag=0;
            for(int y:arr2){
                if(Math.abs(i-y)<=d){
                    flag=1;
                }
            }
            if(flag==0) count++;
        }
        return count;
        
    }
}