class Solution {
    public int maxPoints(int[][] points) {
        HashMap<Double,Integer> map = new HashMap<>();
        if(points==null || points.length==0){
            return 0;
        }
        int max=1;
        int same=0;
        for(int i=1;i<points.length;i++){
            same=0;
            int currMax=1;
            int px=points[i][0];
            int py=points[i][1];
            for(int j=0;j<i;j++){
                double slope;
                int px1=points[j][0];
                int py1=points[j][1];
                if(px==px1 && py==py1){
                    same++;
                    currMax++;
                    continue;
                }
                else if(px==px1){
                    slope=Double.MAX_VALUE;
                }
                else{
                    slope = (double) (py1-py) /(double)(px1-px);
                }
                int h= map.getOrDefault(slope,1)+1;
                map.put(slope,h);
                currMax=Math.max(currMax,same+h);
            }
            max=Math.max(max,currMax);
            map.clear();

        }
        return max;
    }
}