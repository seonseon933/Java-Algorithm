package Binary_Trees.BFS_DFS.p1609_Even_Odd_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class p1609_Even_Odd_Tree {
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

    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> bfs = new LinkedList<>();
        bfs.offer(root);
        boolean even = true;

        while (!bfs.isEmpty()) {
            int size = bfs.size();
            int num = 0;
            for(int i = 0; i < size; i++) {
                TreeNode node = bfs.poll();

                if(even) {
                    if (num == 0 && node.val % 2 == 0) return false;
                    else if(num >= node.val || node.val % 2 == 0) return false;
                    num = node.val;

                    if(node.left != null) bfs.offer(node.left);
                    if(node.right != null) bfs.offer(node.right);
                }else {
                    if (num == 0 && node.val % 2 == 1) return false;
                    else if(num != 0 && (num <= node.val || node.val % 2 == 1)) return false;
                    num = node.val;

                    if(node.left != null) bfs.offer(node.left);
                    if(node.right != null) bfs.offer(node.right);
                }
            }
            even = !even;
        }
        return true;
    }
}
