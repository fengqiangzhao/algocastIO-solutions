package io.algocasts;

import io.algocasts.datastructure.TreeNode;

import java.util.Stack;

/**
 * 判断二叉树是否相同
 * leetcode:100、469
 * Tag:树、DFS
 * Level:易
 * 递归可以使用深度优先搜索
 */
public class P8 {
    //Time:O(m) m为较小二叉树的节点数  Space:O(h) h为较小二叉树的深度，最坏情况下是n
    public boolean isSameTreeRecursive(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        return p.val == q.val && isSameTreeRecursive(p.left, q.left) && isSameTreeRecursive(p.right, q.right);
    }

    //Time:O(n)  Space:O(n), 使用辅助栈
    public boolean isSameTreeIterative(TreeNode p, TreeNode q) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(p);
        stack.push(q);
        while (!stack.empty()) {
            TreeNode s = stack.pop(), t = stack.pop();
            if (s == null && t == null) continue;
            if (s == null || t == null) return false;
            if (s.val != t.val) return false;
            stack.push(s.left);
            stack.push(t.left);
            stack.push(s.right);
            stack.push(t.right);
        }
        return true;
    }
}
