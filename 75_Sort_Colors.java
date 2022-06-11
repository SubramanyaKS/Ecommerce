class Solution {
    public void sortColors(int[] nums) {
        int z=0;
        int f=0;
        int s=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                z++;
            }
            else if(nums[i]==1){
                f++;
            }
            else if(nums[i]==2){
                s++;
            }
        }
        int i=0;
        while(z!=0){
            nums[i]=0;
            z--;
            i++;
        }
        while(f!=0){
            nums[i]=1;
            f--;
            i++;
        }
        while(s!=0){
            nums[i]=2;
            s--;
            i++;
        }                
    }
}
