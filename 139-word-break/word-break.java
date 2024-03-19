class Solution {
   
       public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] table=new boolean[s.length()];
        for(int i=0;i<table.length;i++){
            for(int j=0;j<=i;j++){
                if(j==0||table[j-1]){
                    if(wordDict.contains(s.substring(j,i+1))){
                        table[i]=true;
                        break;
                    }
                }
            }
        }
        return table[table.length-1];
    }
}
