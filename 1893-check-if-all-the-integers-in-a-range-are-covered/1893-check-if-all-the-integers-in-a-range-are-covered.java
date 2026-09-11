class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        for(int j=left;j<=right;j++){
            boolean flag=false;
            for(int i=0;i<ranges.length;i++){
                if(j>=ranges[i][0] && j<=ranges[i][1]){
                    flag=true;
                    break;
                }
            }
            if(!flag) return false;
        }
        return true;
        
    }
}