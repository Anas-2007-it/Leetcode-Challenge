class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> set=new HashSet<>();
        for (String i:banned){
            set.add(i.toLowerCase());
        }
        HashMap<String,Integer> map=new HashMap<>();
        String [] words=paragraph.toLowerCase().split("[!?',;. ]+");
        String res="";
        int max=0;
        for (String i:words){
          if(set.contains(i))
             continue;
          int count=map.getOrDefault(i,0)+1;
          map.put(i,count);
          if (count>max){
            max=count;
            res=i;
          }
        }  
        return res;


        
    }
    
}