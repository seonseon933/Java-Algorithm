package Binary_Trees.BFS_DFS.p1325_Delete_Leaves_With_a_Given_Value;

public class p1325_Delete_Leaves_With_a_Given_Value {
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

    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if(root == null) return null;

        root.left = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);

        if(root.left == null && root.right == null && root.val == target){
            root = null;
        }
        
        return root;
    }
}