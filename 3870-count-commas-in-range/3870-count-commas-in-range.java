class Solution {
    public int countCommas(int n) {
        int count=0;
        for (int i=1;i<=n;i++){
            String digit=String.valueOf(i);
            int res= digit.length();
            if (res>=4){
                count+=(res-1)/3;
            }
        }
        return count;
        
    }
}