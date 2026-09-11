class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String ans="";
        for(String  word:dictionary){
            if(sub(s,word)){
                if(word.length()>ans.length()) ans=word;
                else if(word.length()==ans.length() && word.compareTo(ans)<0){
                    ans=word;


                }
            }
        }
        return ans;

        
    }
    public boolean sub(String s,String word){
        int i=0;
        int j=0;
        while(i<s.length() && j<word.length()){
            if(s.charAt(i)==word.charAt(j)){
                i++;
                j++;
            }else i++;
            
        }
        return j==word.length();
    }
}