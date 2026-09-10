class Solution {
    public String reverseOnlyLetters(String s) {
        char res[]=s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(!Character.isLetter(res[left])){
                left++;
            }
            else if(!Character.isLetter(res[right])){
                right--;
            }
            else{
            char temp=res[left];
            res[left]=res[right];
            res[right]=temp;
            left++;
            right--;
            }
        }
        return new String(res);
        
    }
}