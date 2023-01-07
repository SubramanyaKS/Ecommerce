class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int cr=0;
        int tr=0;
        int s=0;
        for(int i=0;i<gas.length;i++){
            int r=gas[i]-cost[i];
            if(cr<0){
                s=i;
                cr=r;
            }
            else{
                cr+=r;
            }
            tr+=r;
        }
        if(tr<0){
            return -1;
        }
        return s;
        
    }
}