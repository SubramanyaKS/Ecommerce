class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n=s.length();
        boolean b[] = new boolean[n+1];
        b[0]=true;
        for(int i=0;i<n;i++){
            if(!b[i]){
                continue;
            }
            for(String str: wordDict){
                if((i+str.length())>n){
                    continue;
                }
                if(b[i+str.length()]){
                    continue;
                }
                if(s.substring(i,i+str.length()).equals(str)){
                    b[i+str.length()]=true;
                }
            }
        }
        return b[n];
        
    }
}