class Solution {
    public int[] countBits(int n) {
        int ans[]= new int[n+1];
        for(int i=0;i<=n;i++){
            String a= Integer.toBinaryString(i);
            int c=0;
            for(int j=0;j<a.length();j++){
                char b= a.charAt(j);
                if(b=='1'){
                    c++;
                }
            }
            ans[i]=c;

        }
        return ans;
    }
}