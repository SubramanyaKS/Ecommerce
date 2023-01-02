class Solution {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        boolean ans= util(root, k, set);
        return ans;
        
    }
    public boolean util(TreeNode root,int sum,Set<Integer> set){
        if(root==null){
            return false;
        }
        if(util(root.left,sum,set)==true){
            return true;
        }
        if(set.contains(sum-root.val)){
            return true;
        }
        set.add(root.val);
        return util(root.right,sum,set);
    }

}