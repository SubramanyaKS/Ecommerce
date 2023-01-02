class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int len = n-1;
        int t[] = new int[n];

        for(int i=0;i<triangle.get(len).size();i++){
            t[i]=triangle.get(len).get(i);
        }

        for(int i=triangle.size()-2;i>=0;i--){
            for(int j=0;j<triangle.get(i+1).size()-1;j++){
                t[j]=triangle.get(i).get(j)+Math.min(t[j],t[j+1]);
            }
        }
        return t[0];
    }
}