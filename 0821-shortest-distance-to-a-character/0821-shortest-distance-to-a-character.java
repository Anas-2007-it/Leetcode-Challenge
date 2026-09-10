class Solution {
    public int[] shortestToChar(String s, char c) {
        int n=s.length();
        int ans[] =new int[n];
        int target=-100000;
        // left to right
        for(int i=0;i<n;i++){
            if(s.charAt(i)==c){
                target=i;
            }
            ans[i]=i-target;

        }
        target=100000;
        //right to left
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)==c){
                target=i;
                
            }
            ans[i]=Math.min(ans[i],target-i);
        }
        return ans;

        
    }
}