class BSTToGreaterTree {
    int prev;
    public TreeNode convertBST(TreeNode root) {
        if(root == null)
            return null;
        
        convertBST(root.right);
        
        root.val = root.val + prev;
        prev = root.val;
        
        convertBST(root.left);
       
        return root;
    }
}
