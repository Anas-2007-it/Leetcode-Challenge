/* class Solution {
    public int numOfSubarrays(int[] arr) {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum%2!=0){
                    count+=1;
                }
                    
                
            }
        }
        return count;
        
    }
}*/
class Solution {
    public int numOfSubarrays(int[] arr) {
        int even = 1;
        int odd = 0;
        int count = 0;
        int sum = 0;
        int mod = 1000000007;
        for (int i = 0; i < arr.length; i++) {  
            sum += arr[i];
            if (sum % 2 != 0) {
                count = (count + even) % mod;
                odd++;
            } 
            else {
                count = (count + odd) % mod;
                even++;
            }
        }

        return count;
    }
}