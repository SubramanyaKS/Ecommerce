class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n/2;i++){
            for(int k=i;k<n-i-1;k++){
                int temp=matrix[i][k];
                matrix[i][k]=matrix[n-k-1][i];
                matrix[n-k-1][i]=matrix[n-1-i][n-k-1];
                matrix[n-1-i][n-k-1]=matrix[k][n-1-i];
                matrix[k][n-1-i]=temp;
            }
        }
        
    }
}