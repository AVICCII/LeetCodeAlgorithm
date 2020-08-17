package easy;


/**
 * @author aviccii 2020/8/17
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 */
public class Case17isBalanced {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            return Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
        }
    }
    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(height(root.left), height(root.right)) + 1;
        }
    }
public class TreeNode {
  int val;
 TreeNode left;
 TreeNode right;
 TreeNode(int x) { val = x; }
 }

}
