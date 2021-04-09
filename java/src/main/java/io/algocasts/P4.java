package io.algocasts;

import io.algocasts.datastructure.TreeNode;

import java.util.Stack;

/**
 * 判断二叉树是否对称
 * leetcode:101,1360
 * Tag:树,DFS,BFS
 * Level:易
 */
public class P4 {
    private boolean isSymmetric(TreeNode s, TreeNode t) {
        if (s != null && t != null) {
            return s.val == t.val && isSymmetric(s.left, t.right) && isSymmetric(s.right, t.left);
        }
        return s == null && t == null;
    }

    //Time:O(n), Space:O(h)
    public boolean isSymmetricTreeRecursive(TreeNode root) {
        if (root == null) return true;
        return isSymmetric(root.left, root.right);
    }

    //Time:O(n), Space:O(n)
    public boolean isSymmetricTreeIterative(TreeNode root) {
        if (root == null) return true;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);

        while (!stack.empty()) {
            TreeNode s = stack.pop(), t = stack.pop();
            if (s == null && t == null) continue;
            if (s == null || t == null) return false;
            if (s.val != t.val) return false;

            stack.push(s.left);
            stack.push(t.right);
            stack.push(s.right);
            stack.push(t.left);
        }
        return true;
    }
}
