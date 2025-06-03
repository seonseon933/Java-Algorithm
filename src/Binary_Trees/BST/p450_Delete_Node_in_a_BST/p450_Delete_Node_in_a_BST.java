package Binary_Trees.BST.p450_Delete_Node_in_a_BST;

public class p450_Delete_Node_in_a_BST {
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

    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        
        if(root.val > key) root.left = deleteNode(root.left, key);
        else if(root.val < key) root.right = deleteNode(root.right, key);
        else{
            if(root.left == null && root.right == null) return null;
            else if(root.left == null) return root.right;
            else if(root.right == null) return root.left;
            
            // 양쪽 자식이 모두 있을 경우엔, 오른쪽 서브트리에서 가장 작은 값을 찾아야 함.
            // or 왼쪽 서브트리에서 가장 큰 값도 가능.
            TreeNode min = findMinTree(root.right);

            root.val = min.val;
            // 중복인 min을 삭제하기 위해 deleteNode를 사용해 min.val의 node를 삭제하도록 함. 
            root.right = deleteNode(root.right, min.val);
        }
        return root;
    }

    private TreeNode findMinTree(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}
