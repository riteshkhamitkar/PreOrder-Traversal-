class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        
        traverse(root, lst);
        
        return lst;
          
    }
    
    public void traverse(TreeNode root, List<Integer> lst){
        
        if(root!=null){
            lst.add(root.val);
        traverse(root.left,lst);
        traverse(root.right,lst);
        }
        
         
    }
    
}

// PreOrder Traversal : Root , Left, Right 