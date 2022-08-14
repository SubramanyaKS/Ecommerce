class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums,target,0,nums.length-1);
    }
    public int binarySearch(int[] nums,int target,int l,int r){
        if(l>r){
            return -1;
        }
        int mid=(l+r)/2;
        if(nums[mid]==target){
            return mid;
        }
        if(nums[l]<=nums[mid]){
            if(target>=nums[l] && target<=nums[mid]){
                return binarySearch(nums,target,l,mid-1);
            }
            return binarySearch(nums,target,mid+1,r);
        }
        if(target>=nums[mid] && target<=nums[r]){
            return binarySearch(nums,target,mid+1,r);
        }
        return binarySearch(nums,target,l,mid-1);
        
    }
  
}