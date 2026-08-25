class Solution {
    public boolean checkDivisibility(int n) {
        int org=n;
        int dsum=0;
        int pro=1;
        while(n!=0){
            int digit=n%10;
            dsum+=digit;
            pro*=digit;
            n/=10;
        }
        return org%(dsum+pro)==0;
        
    }
}