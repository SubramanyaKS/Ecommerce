class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m+1][n+1];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return path(0,0,m-1,n-1,dp);
        
    }
    public int path(int cr,int cc,int tr,int tc, int [][] dp){
        if(cr>tr || cc>tc){
            return 0;
        }
        if(cr==tr && cc==tc){
            return 1;
        }
        if(dp[cr][cc]!=-1){
            return dp[cr][cc];
        }
        return dp[cr][cc]=path(cr+1,cc,tr,tc,dp)+path(cr,cc+1,tr,tc,dp);
    }
}