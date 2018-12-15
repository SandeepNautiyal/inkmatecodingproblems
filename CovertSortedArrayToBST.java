class CovertSortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0)
            return null;
        if(nums.length == 1)
            return new TreeNode(nums[0]);
        
        return sortedArrayToBST(null, nums, 0, nums.length-1);
    }
    
    public TreeNode sortedArrayToBST(TreeNode root, int[] nums, int start, int end)     {
        int mid  = (start + end)/2;
        if(start > end){
            return null;
        }
        
        root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(root, nums, start,mid-1);
        root.right = sortedArrayToBST(root, nums, mid+1,end);
        return root;
    }
}
