class Solution {
    public boolean canJump(int[] nums) {
        int l=0;
        for(int i=0;i<=l;i++){
            l=Math.max(l,nums[i]+i);
            if(l>=nums.length-1){
                return true;
            }

        }
        return false;        
    }
}