package Binary_Trees.BST.p235_Lowest_Common_Ancestor_of_a_Binary_Search_Tree;

public class p235_Lowest_Common_Ancestor_of_a_Binary_Search_Tree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val > p.val && root.val > q.val) return lowestCommonAncestor(root.left, p, q);
        else if(root.val < p.val && root.val < q.val) return lowestCommonAncestor(root.right, p, q);
        else return root;
    }
}
