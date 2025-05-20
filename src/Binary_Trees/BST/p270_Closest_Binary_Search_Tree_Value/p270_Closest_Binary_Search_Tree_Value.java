package Binary_Trees.BST.p270_Closest_Binary_Search_Tree_Value;

public class p270_Closest_Binary_Search_Tree_Value {
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

    public int closestValue(TreeNode root, double target) {
        int res = root.val;

        while (root != null) {
            if (Math.abs(root.val - target) < Math.abs(res - target)) {
                res = root.val;
            }

            if(target < root.val){
                root = root.left;
            }else{
                root = root.right;
            }
        }

        return res;
    }
}
