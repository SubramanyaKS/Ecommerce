class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n= grid[0].length;
        boolean v[][] = new boolean[m][n];
        int k=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!v[i][j] && grid[i][j]=='1'){
                    dfs(grid,i,j,v);
                    k++;
                }
            }
        }
        return k;
        
    }
    void dfs(char[][] grid,int i,int j,boolean[][] v){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || v[i][j] || grid[i][j]=='0'){
            return;
        }
        v[i][j]=true;
        dfs(grid,i,j-1,v);
        dfs(grid,i-1,j,v);
        dfs(grid,i,j+1,v);
        dfs(grid,i+1,j,v);
    }
}